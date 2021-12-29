package app.trian.cashierservice.entity

data class Invoices(
    var InvoiceID:Long,
    var order:Orders,
    var invoiceDate:String,
    var provideTo:String,
    var createdAt:Long,
    var updatedAt:Long
)