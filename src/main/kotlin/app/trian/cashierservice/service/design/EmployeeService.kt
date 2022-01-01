package app.trian.cashierservice.service.design

import app.trian.cashierservice.model.request.EmployeeRequest
import app.trian.cashierservice.model.response.BaseResponse
import app.trian.cashierservice.model.response.EmployeeResponse
import org.springframework.data.domain.Pageable

/**
 * EmployeeService
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 28/12/21 13.43
 */
interface EmployeeService {
    fun getListEmployeeByStore(branchID:Long,pageable: Pageable):BaseResponse<List<EmployeeResponse>>

    fun addNewEmployee(request:EmployeeRequest):BaseResponse<EmployeeResponse>

    fun editEmployee(request: EmployeeRequest):BaseResponse<EmployeeResponse>

    fun deleteEmployee(employeeID:Long):BaseResponse<EmployeeResponse>
}