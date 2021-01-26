package spring.interseptors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class CustomInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // preHandle() - используется для выполнения операций перед отправкой запроса в контроллер. Этот метод должен возвращать true, чтобы вернуть ответ клиенту.
        log.info("Hello from CustomInterceptor, preHandle");
        Long time = System.currentTimeMillis();
        request.setAttribute("time", time);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //postHandle () — используется для выполнения операций перед отправкой ответа клиенту.
        Long time = (Long) request.getAttribute("time");
        log.info("Hello from CustomInterceptor, postHandle time -{}", System.currentTimeMillis() - time);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //afterCompletion () метод — используется для выполнения операций после завершения запроса и ответа.
        Long time = (Long) request.getAttribute("time");
        log.info("Hello from CustomInterceptor, afterCompletion time -{}", System.currentTimeMillis() - time);
    }
}
