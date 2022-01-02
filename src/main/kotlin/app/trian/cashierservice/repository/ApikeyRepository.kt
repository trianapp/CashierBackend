package app.trian.cashierservice.repository

import app.trian.cashierservice.entity.ApiKey
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Api Key
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 01/01/22 11.49
 */
interface ApikeyRepository: PagingAndSortingRepository<ApiKey, Long> {
    fun findTopByValue(value: String):ApiKey?
}