package app.trian.cashierservice.service.design

import app.trian.cashierservice.model.request.ProductRequest
import app.trian.cashierservice.model.response.BaseResponse
import app.trian.cashierservice.model.response.ProductResponse
import org.springframework.data.domain.Pageable

/**
 * ProductService
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 28/12/21 13.43
 */
interface ProductsService {
    fun getListProduct(storeID:Long,pageable: Pageable):BaseResponse<List<ProductResponse>>

    fun purchaseProduct(request: ProductRequest):BaseResponse<ProductResponse>

    fun updateProduct(request: ProductRequest):BaseResponse<ProductResponse>

    fun deleteProduct(productID:Long):BaseResponse<ProductResponse>
}