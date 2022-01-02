package app.trian.cashierservice.entity

import app.trian.cashierservice.model.StoreBranchType
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
    @ManyToOne(
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "StoreID")
    var store: Store?,
    @OneToMany(
        mappedBy = "storeBranch",
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    var employees: List<Employees> = emptyList(),
    @Column
    var branchType:StoreBranchType,
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
