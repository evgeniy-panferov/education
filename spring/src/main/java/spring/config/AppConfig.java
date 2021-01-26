package spring.config;

import spring.filter.CookieFilter;
import spring.filter.SimpleFilter;
import spring.interseptors.CustomInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Autowired
    private CustomInterceptor customInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customInterceptor);
    }

    @Bean
    public FilterRegistrationBean<CookieFilter> cookieFilter() {
        FilterRegistrationBean<CookieFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new CookieFilter());
        registrationBean.addUrlPatterns("/animal");

        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<SimpleFilter> simpleFilter() {
        FilterRegistrationBean<SimpleFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new SimpleFilter());
        registrationBean.addUrlPatterns("/cookie");

        return registrationBean;
    }
}
