package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table(name = "Customers")
data class Customers(
    @GeneratedValue
    @Id
    @Column
    var CustomerID:Long=0,
    @Column
    var companyName:String,
    @Column
    var name:String,
    @Column
    var city:String,
    @Column
    var state:String,
    @Column
    var country:String,
    @Column
    var postalCode:String,
    @Column
    var phone:String,
    @Column
    var type:String,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)
