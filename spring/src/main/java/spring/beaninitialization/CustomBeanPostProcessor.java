package spring.beaninitialization;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;


/*
Интерфейс BeanPostProcessor позволяет вклиниться в процесс настройки ваших бинов до того, как они попадут в контейнер.
Если вы хотите сделать прокси над вашим объектом, то имейте ввиду, что это принято делать после вызова init метода,
иначе говоря это нужно делать в методе postProcessAfterInitialization.
 */
@Component
@Slf4j
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("animal")) {
            log.info("Привет из CustomBeanPostProcessor - метод postProcessBeforeInitialization, имя бина - " + beanName);
        }
        Field[] declaredFields = bean.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            InjectName annotation = field.getAnnotation(InjectName.class);
            if (annotation != null) {
                String name = annotation.name();
                field.setAccessible(true);
                ReflectionUtils.setField(field, bean, name);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("animal")) {
            log.info("Привет из CustomBeanPostProcessor - метод postProcessAfterInitialization, имя бина - " + beanName);
        }
        return bean;
    }
}
