package app.trian.cashierservice.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table
data class Store(
    @Id
    @GeneratedValue
    var StoreID:Long,
    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "StoreBranchID",
        cascade = [CascadeType.ALL]
    )
    @JsonIgnore
    var branchLList: List<StoreBranch> = emptyList(),
    @Column
    var storeName:String,
    @Column
    var storeLogo:String,
    @Column
    var storeAddress:String,
    @Column
    var createdBy:Long,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)
