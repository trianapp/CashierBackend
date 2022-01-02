package app.trian.cashierservice.model.request

import app.trian.cashierservice.entity.Roles
import app.trian.cashierservice.entity.Users
import app.trian.cashierservice.model.ProviderType
import app.trian.cashierservice.model.UserType
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class RegisterRequest(
    @field:NotNull
    var roleID: Long?,
    var provider: ProviderType?,
    @field:NotBlank
    var uid:String?,
    @field:NotBlank
    var username:String?,
    @field:NotBlank
    var password:String?,
    @field:NotBlank
    var email:String?,
    @field:NotBlank
    var type: UserType?,
)

fun RegisterRequest.toEntity() = Users(
    UserID = 0,
    provider = provider!!,
    uid = uid!!,
    email = email!!,
    username=username!!,
    password = password!!,
    role = null,
    type = type!!,
    createdAt = 0,
    updatedAt = 0
)