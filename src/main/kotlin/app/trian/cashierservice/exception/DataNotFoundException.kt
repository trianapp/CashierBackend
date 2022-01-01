package app.trian.cashierservice.exception

import app.trian.cashierservice.model.HTTP_NOT_FOUND
import app.trian.cashierservice.model.StatusResponse
import app.trian.cashierservice.model.response.BaseResponse

class DataNotFoundException(override val message: String?):Exception()

fun DataNotFoundException.toResponse()= BaseResponse(
    status = StatusResponse.NO_FOUND,
    code = HTTP_NOT_FOUND,
    data = "",
    message = this.message ?: "Data not found!"
)