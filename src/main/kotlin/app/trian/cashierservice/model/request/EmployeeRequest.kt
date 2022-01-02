package app.trian.cashierservice.model.request

import app.trian.cashierservice.entity.*
import app.trian.cashierservice.model.EmployeeType
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

/**
 *
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 01/01/22 20.29
 */
data class EmployeeRequest(
    var position: EmployeePosition?,
    var user: Users?,
    var storeBranch: StoreBranch?,
    var reportTo: Employees?,
    var orders:List<Orders> = emptyList(),
    var firstName:String,
    var lastName:String,
    var photo:String,
    var type: EmployeeType,
    var createdAt:Long,
    var updatedAt:Long
)
