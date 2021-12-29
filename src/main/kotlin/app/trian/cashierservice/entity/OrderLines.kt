package app.trian.cashierservice.entity

data class OrderLines(
    var OrderLineID:Long,
    var orders: Orders,
    var products: Products,
    var quantity:Int,
    var unitPrice:Double,
    var createdAt:Long,
    var updatedAt:Long
)
