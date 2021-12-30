package app.trian.cashierservice.entity

import app.trian.cashierservice.model.CustomerType
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table
data class Customers(
    @GeneratedValue
    @Id
    @Column
    var CustomerID:Long=0,
    @OneToMany(
        mappedBy = "customers",
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JsonIgnore
    var orders:List<Orders> = emptyList(),
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
    var type:CustomerType,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)
