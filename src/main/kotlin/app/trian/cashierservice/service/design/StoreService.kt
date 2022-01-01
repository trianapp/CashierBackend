package app.trian.cashierservice.service.design

import app.trian.cashierservice.model.request.StoreBranchRequest
import app.trian.cashierservice.model.request.StoreRequest
import app.trian.cashierservice.model.response.BaseResponse
import app.trian.cashierservice.model.response.StoreBranchResponse
import app.trian.cashierservice.model.response.StoreResponse
import org.springframework.data.domain.Pageable

/**
 * StoreService
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 28/12/21 13.43
 */
interface StoreService {
    fun getListStore(pageable: Pageable):BaseResponse<List<StoreResponse>>

    fun getListBranchStore(storeID:Long,pageable: Pageable):BaseResponse<List<StoreBranchResponse>>

    fun createNewStore(request:StoreRequest):BaseResponse<StoreResponse>

    fun updateStore(request:StoreRequest):BaseResponse<StoreResponse>

    fun deleteStore(storeID: Long):BaseResponse<StoreResponse>

    fun addNewBranchStore(request: StoreBranchRequest):BaseResponse<StoreBranchResponse>

    fun updateBranchStore(request: StoreBranchRequest):BaseResponse<StoreBranchResponse>

    fun deleteBranchStore(storeBranchID:Long):BaseResponse<StoreBranchResponse>



}