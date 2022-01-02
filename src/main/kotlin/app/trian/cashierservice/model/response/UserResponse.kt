package app.trian.cashierservice.model.response

import app.trian.cashierservice.entity.Roles
import app.trian.cashierservice.entity.Users
import app.trian.cashierservice.model.ProviderType
import app.trian.cashierservice.model.UserType
import javax.persistence.*

/**
 *
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 01/01/22 20.29
 */
data class UserResponse(
    var UserID:Long,
    var role: Roles?,
    var provider: ProviderType,
    var uid:String,
    var username:String,
//  var password:String,
    var email:String,
    var type: UserType,
    var createdAt:Long,
    var updatedAt:Long
)

fun Users.toResponse() =
    UserResponse(
        UserID = UserID,
        role = role,
        provider = provider,
        uid = uid,
        username = username,
        email=email,
        type = type,
        createdAt=createdAt,
        updatedAt = updatedAt
    )
