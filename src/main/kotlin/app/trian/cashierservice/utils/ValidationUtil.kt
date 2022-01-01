package app.trian.cashierservice.utils

import org.springframework.stereotype.Component
import javax.validation.ConstraintViolationException
import javax.validation.Validator

/**
 * Class for validation
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 01/01/22 17.14
 */
@Component
class ValidationUtil(
    val validator: Validator
) {
    fun validate(any:Any){
        val result = validator.validate(any)

        if(result.size != 0){
            throw ConstraintViolationException(result)
        }
    }
}