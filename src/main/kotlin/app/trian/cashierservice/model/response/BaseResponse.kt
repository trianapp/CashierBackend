package app.trian.cashierservice.model.response

import app.trian.cashierservice.model.StatusResponse

/**
 *
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 01/01/22 20.29
 */
data class BaseResponse<MODEL>(
    val status:StatusResponse,
    val code:Int,
    val data:MODEL,
    val message:String
)