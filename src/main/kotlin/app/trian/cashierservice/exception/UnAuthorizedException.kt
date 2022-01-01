package app.trian.cashierservice.exception

import app.trian.cashierservice.model.HTTP_UNAUTHORIZED
import app.trian.cashierservice.model.StatusResponse
import app.trian.cashierservice.model.response.BaseResponse

class UnAuthorizedException(override val message: String?):Exception()

fun UnAuthorizedException.toResponse()=BaseResponse(
        status = StatusResponse.UNAUTHORIZED,
        code = HTTP_UNAUTHORIZED,
        data = "",
        message=this.message ?: "Access denied!"
)
