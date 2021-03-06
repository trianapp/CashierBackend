package app.trian.cashierservice.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table
data class ProductCategory(
    @Id
    @GeneratedValue
    var ProductCategoryID:Long,
    @Column
    var category:String,
    @Column
    var description:String,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)
