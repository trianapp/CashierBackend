package app.trian.cashierservice.config

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter
import org.springframework.web.servlet.HandlerExceptionResolver
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class FilterChainExceptionHandler(
    @Qualifier("handlerExceptionResolver")
    private val resolver: HandlerExceptionResolver
) : OncePerRequestFilter(){

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        try {
            filterChain.doFilter(request,response)
        }catch (e:Exception){
            resolver.resolveException(request,response,null,e)
        }
    }
}