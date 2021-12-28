package app.trian.cashierservice.service.design

/**
 * OrderService
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 28/12/21 13.43
 */
interface OrderService {
    fun getListOrder()

    fun getDetailOrderById()

    fun addNewOrder()

    fun holdOrder()

    fun editOrder()

    fun deleteOrder()
}