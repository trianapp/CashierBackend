package app.trian.cashierservice.model.response

import app.trian.cashierservice.model.StatusResponse

data class BaseResponse<MODEL>(
    val status:StatusResponse,
    val code:Int,
    val data:MODEL,
    val message:String
)