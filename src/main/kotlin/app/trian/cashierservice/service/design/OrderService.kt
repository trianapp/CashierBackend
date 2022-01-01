package app.trian.cashierservice.service.design

import app.trian.cashierservice.model.request.OrderRequest
import app.trian.cashierservice.model.response.BaseResponse
import app.trian.cashierservice.model.response.OrderResponse

/**
 * OrderService
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 28/12/21 13.43
 */
interface OrderService {
    fun getListOrder():BaseResponse<List<OrderResponse>>

    fun getDetailOrderById():BaseResponse<OrderResponse>

    fun addNewOrder(request:OrderRequest):BaseResponse<OrderResponse>

    fun holdOrder(orderID: Long):BaseResponse<OrderResponse>

    fun editOrder(request:OrderRequest):BaseResponse<OrderResponse>

    fun deleteOrder(orderID:Long):BaseResponse<OrderResponse>
}