package app.trian.cashierservice.service

import app.trian.cashierservice.exception.DataAlreadyExistException
import app.trian.cashierservice.exception.DataNotFoundException
import app.trian.cashierservice.exception.UnAuthorizedException
import app.trian.cashierservice.model.HTTP_CREATED
import app.trian.cashierservice.model.HTTP_OK
import app.trian.cashierservice.model.StatusResponse
import app.trian.cashierservice.model.request.LoginRequest
import app.trian.cashierservice.model.request.RegisterRequest
import app.trian.cashierservice.model.request.ResetPasswordRequest
import app.trian.cashierservice.model.request.toEntity
import app.trian.cashierservice.model.response.BaseResponse
import app.trian.cashierservice.model.response.UserResponse
import app.trian.cashierservice.model.response.toResponse
import app.trian.cashierservice.repository.RolesRepository
import app.trian.cashierservice.repository.UsersRepository
import app.trian.cashierservice.service.design.AuthService
import app.trian.cashierservice.utils.ValidationUtil
import org.joda.time.DateTime
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

/**
 *
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 01/01/22 23.47
 */
@Service
class AuthServiceImpl(
    private val usersRepository: UsersRepository,
    private val rolesRepository: RolesRepository,
    private val validationUtil: ValidationUtil
):AuthService {
    override fun login(request: LoginRequest): BaseResponse<UserResponse> {
        validationUtil.validate(request)

        val findUser = usersRepository.findTopByUsernameAndPassword(request.username!!,request.password!!)
            ?: throw UnAuthorizedException("Cannot find user with ${request.username} and ${request.password}")

        return BaseResponse(
            status=StatusResponse.OK,
            code= HTTP_OK,
            data = findUser.toResponse(),
            message = "Login success"
        )
    }

    override fun loginProvider(uid: String): BaseResponse<UserResponse> {
        val findUser = usersRepository.findTopByUid(uid)
            ?: throw UnAuthorizedException("Cannot find user with uid $uid")

        return BaseResponse(
            status = StatusResponse.OK,
            code = HTTP_OK,
            data = findUser.toResponse(),
            message = "Login success"
        )
    }

    override fun register(request: RegisterRequest): BaseResponse<UserResponse> {
        //validate request
        validationUtil.validate(request)

        //check if username already taken
        val findUserExist = usersRepository.findTopByUsername(request.username!!)
        if(findUserExist!= null)  throw DataAlreadyExistException("Username already use by another user!")

        //check if role is available
        val findRole = rolesRepository.findByIdOrNull(request.roleID) ?: throw DataNotFoundException("No role found with id ${request.roleID}")
        //construct data before proceed
        val currentTime = DateTime().millis
        val prepareData = request.toEntity().apply {
            UserID = currentTime
            role = findRole
            createdAt = currentTime
            updatedAt = currentTime
        }

        //save data
        val savedData = usersRepository.save(prepareData)

        return BaseResponse(
            status = StatusResponse.OK,
            code = HTTP_CREATED,
            data = savedData.toResponse(),
            message = "Users registered"
        )

    }

    override fun registerProvider(request: RegisterRequest): BaseResponse<UserResponse> {
        //validate request
        validationUtil.validate(request)

        //check if username already taken
        val findUserExist = usersRepository.findTopByUid(request.uid!!)
        if(findUserExist!= null)  throw DataAlreadyExistException("User already registered!")

        //check if role is available
        val findRole = rolesRepository.findByIdOrNull(request.roleID)
            ?: throw DataNotFoundException("No role found with id ${request.roleID}")
        //construct data before proceed
        val currentTime = DateTime().millis
        val prepareData = request.toEntity().apply {
            UserID = currentTime
            role = findRole
            createdAt = currentTime
            updatedAt = currentTime
        }

        //save data
        val savedData = usersRepository.save(prepareData)

        return BaseResponse(
            status = StatusResponse.OK,
            code = HTTP_CREATED,
            data = savedData.toResponse(),
            message = "Users registered"
        )
    }

    override fun resetPassword(request: ResetPasswordRequest): BaseResponse<UserResponse> {
        TODO("Not yet implemented")
    }
}