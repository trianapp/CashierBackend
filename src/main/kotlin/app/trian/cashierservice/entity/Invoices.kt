package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class Invoices(
    @Id
    var InvoiceID:Long,
    @ManyToOne
    var order:Orders?,
    @Column
    var invoiceDate:String,
    @Column
    var provideTo:String,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)