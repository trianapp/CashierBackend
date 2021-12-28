package app.trian.cashierservice.entity

data class Suppliers(
    var SupplierID:Long,
    var companyName:String,
    var contactName:String,
    var phoneOffice:String,
    var email:String,
    var city:String,
    var address:String,
    var country:String,
    var postalCode:String,
    var createdAt:Long,
    var updatedAt:Long
)
