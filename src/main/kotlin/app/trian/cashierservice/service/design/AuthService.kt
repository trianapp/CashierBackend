package app.trian.cashierservice.service.design

import app.trian.cashierservice.model.request.LoginRequest
import app.trian.cashierservice.model.request.RegisterRequest
import app.trian.cashierservice.model.request.ResetPasswordRequest
import app.trian.cashierservice.model.response.BaseResponse
import app.trian.cashierservice.model.response.UserResponse

/**
 * Auth Service
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 28/12/21 13.42
 * this interface contains design that will be available
 */
interface AuthService {
    fun login(request:LoginRequest):BaseResponse<UserResponse>

    fun loginProvider(uid: String):BaseResponse<UserResponse>

    fun register(request:RegisterRequest):BaseResponse<UserResponse>

    fun registerProvider(request:RegisterRequest):BaseResponse<UserResponse>

    fun resetPassword(request:ResetPasswordRequest):BaseResponse<UserResponse>

}