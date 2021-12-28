package app.trian.cashierservice.service.design

/**
 * ProductService
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 28/12/21 13.43
 */
interface ProductsService {
    fun getListProduct()

    fun purchaseProduct()

    fun saleProduct()

    fun updateProduct()

    fun deleteProduct()
}