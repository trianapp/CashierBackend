package app.trian.cashierservice.model

enum class StatusResponse {
    OK,
    UNAUTHORIZED,
    ERROR,
    FAILED,
    DENIED,
    BAD_REQUEST,
    TIMEOUT,
    NO_FOUND
}
const val HTTP_OK =200
const val HTTP_CREATED = 201
const val HTTP_INTERNAL_ERROR = 500
const val HTTP_ERROR = 400
const val HTTP_NOT_FOUND = 404
const val HTTP_UNAUTHORIZED = 401