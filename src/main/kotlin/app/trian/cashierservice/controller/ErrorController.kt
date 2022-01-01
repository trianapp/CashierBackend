package app.trian.cashierservice.controller

import app.trian.cashierservice.exception.UnAuthorizedException
import app.trian.cashierservice.exception.toResponse
import app.trian.cashierservice.model.response.BaseResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.validation.ConstraintViolationException

/**
 * RestControllerAdvice
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 30/12/21 23.36
 */
@RestControllerAdvice
class ErrorController {
    @ExceptionHandler(
        value = [UnAuthorizedException::class]
    )
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    fun unAuthorized(error:UnAuthorizedException) = error.toResponse()

    @ExceptionHandler(
        value = [ConstraintViolationException::class]
    )
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    fun validation(error:ConstraintViolationException) = error.toResponse()
}