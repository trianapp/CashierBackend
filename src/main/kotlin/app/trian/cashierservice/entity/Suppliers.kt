package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class Suppliers(
    @Id
    @GeneratedValue
    var SupplierID:Long,
    @OneToMany(
        mappedBy = "ProductSupplierID",
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    var productSuppliers: List<ProductSuppliers> = emptyList(),
    @Column
    var companyName:String,
    @Column
    var contactName:String,
    @Column
    var phoneOffice:String,
    @Column
    var email:String,
    @Column
    var city:String,
    @Column
    var address:String,
    @Column
    var country:String,
    @Column
    var postalCode:String,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)
