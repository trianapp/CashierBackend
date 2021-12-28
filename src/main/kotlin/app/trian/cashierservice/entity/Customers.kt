package app.trian.cashierservice.entity

data class Customers(
    var CustomerID:Long,
    var companyName:String,
    var name:String,
    var city:String,
    var state:String,
    var country:String,
    var postalCode:String,
    var phone:String,
    var type:String,
    var createdAt:Long,
    var updatedAt:Long
)
