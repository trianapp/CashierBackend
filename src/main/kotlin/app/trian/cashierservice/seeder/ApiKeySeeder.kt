package app.trian.cashierservice.seeder

import app.trian.cashierservice.entity.ApiKey
import app.trian.cashierservice.repository.ApikeyRepository
import org.joda.time.DateTime
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

/**
 * Api Key seeder
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 01/01/22 11.48
 */
@Component
class ApiKeySeeder(
    private val apikeyRepository: ApikeyRepository
) :ApplicationRunner{
    override fun run(args: ApplicationArguments?) {
        var date = DateTime().millis
        val value = "AZKIAkda=Dkzxlahsdewdsbdvodsd"
        val findApiKey = apikeyRepository.findTopByValue(value)

        if(findApiKey == null){
            val apiKey = ApiKey(
                id = date,
                createdAt = date,
                updatedAt = date,
                value = value
            )
            apikeyRepository.save(apiKey)
        }

    }
}