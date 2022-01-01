package app.trian.cashierservice.repository

import app.trian.cashierservice.entity.Products
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 01/01/22 20.19
 */
interface ProductsRepository:PagingAndSortingRepository<Products,Long> {
}