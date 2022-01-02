package app.trian.cashierservice.exception

import app.trian.cashierservice.model.HTTP_ERROR
import app.trian.cashierservice.model.HTTP_NOT_FOUND
import app.trian.cashierservice.model.StatusResponse
import app.trian.cashierservice.model.response.BaseResponse

class DataAlreadyExistException(override val message: String?):Exception()

fun DataAlreadyExistException.toResponse()= BaseResponse(
    status = StatusResponse.DENIED,
    code = HTTP_ERROR,
    data = "",
    message = this.message ?: "Data Already exist!"
)