package app.trian.cashierservice.entity

data class Orders(
    var OrderID:Long,
    var employees: Employees,
    var customers: Customers,
    var orderStatus:String,
    var createdAt:Long,
    var updatedAt:Long,

)
