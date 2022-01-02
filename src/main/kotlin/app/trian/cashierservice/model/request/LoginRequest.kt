package app.trian.cashierservice.model.request

import javax.validation.constraints.NotBlank

/**
 *
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 01/01/22 20.29
 */
data class LoginRequest(
    @field:NotBlank
    var username:String?,
    @field:NotBlank
    var password:String?,
)