package spring.beaninitialization;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

// ContextRefreshedEvent - работает, когда все бины уже настроены и готовы к работе
// Он относится к контексту а не к самому бину.
@Component
@Slf4j
public class CustomContextListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //      log.info("3 фаза конструктора");
    }
}
