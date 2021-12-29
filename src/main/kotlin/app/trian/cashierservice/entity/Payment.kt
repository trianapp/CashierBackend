package app.trian.cashierservice.entity

data class Payment(
    var PaymentID:Long,
    var order:Orders,
    var paymentMethod:String,
    var amount:Double,
    var createdAt:Long,
    var updatedAt:Long
)
