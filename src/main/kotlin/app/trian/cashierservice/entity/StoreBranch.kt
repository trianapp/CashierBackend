package app.trian.cashierservice.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import javax.persistence.*

@Entity
@Table
data class StoreBranch(
    @Id
    @GeneratedValue
    var StoreBranchID:Long,
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "StoreID")
    var store: Store,
    @OneToMany(
        mappedBy = "DeviceID",
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @Fetch(
        value = FetchMode.SUBSELECT
    )
    @JsonIgnore
    var devices:List<Device> = emptyList(),
    @Column
    var branchType:String,
    @Column
    var branchName:String,
    @Column
    var branchAddress:String,
    @Column
    var branchPhone:String,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)
