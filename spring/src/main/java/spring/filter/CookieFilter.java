package spring.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Slf4j
public class CookieFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("Hi from CookieFilter");
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        Cookie[] cookies = httpServletRequest.getCookies();
        boolean containsCookie = false;
        if (cookies == null) {
            httpServletResponse.sendRedirect("/");
        } else {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if (name.equals("dogcookie")) {
                    containsCookie = true;
                }
            }
            if (containsCookie) {
                chain.doFilter(request, response);
            } else {
                httpServletResponse.sendRedirect("/");
            }
        }
    }
}
