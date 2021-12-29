package app.trian.cashierservice.entity

data class Employees(
    var EmployeeID:Long,
    var position: EmployeePosition,
    var user: User,
    var storeBranch: StoreBranch,
    var firstName:String,
    var lastName:String,
    var reportTo:Employees?,
    var photo:String,
    var createdAt:Long,
    var updatedAt:Long
)