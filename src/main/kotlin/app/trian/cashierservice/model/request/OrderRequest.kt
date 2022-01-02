package app.trian.cashierservice.model.request

import app.trian.cashierservice.entity.Customers
import app.trian.cashierservice.entity.Employees
import app.trian.cashierservice.entity.Invoices
import app.trian.cashierservice.entity.OrderLines
import app.trian.cashierservice.model.OrderStatus


/**
 *
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 01/01/22 20.29
 */
data class OrderRequest(

    var employeeID: Long?,

    var customerID: Long?,

    var orderLines:List<OrderLines> = emptyList(),

    var orderStatus: OrderStatus,

    var createdAt:Long,

    var updatedAt:Long,
)