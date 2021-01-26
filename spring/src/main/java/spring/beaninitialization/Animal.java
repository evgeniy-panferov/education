package spring.beaninitialization;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/*
Итак, еще раз алгоритм инициализации контекста:
Spring сканирует наш конфигурационный файл(xml, java config, annotation, groovy ).
Создает BeanDefinition’ы и кладет их в HashMap.
Приходит BeanFactory и из этой HashMap отдельно складывает все BeanPostProcessor’ы.
Создает из BeanDefinition’ов бины и кладет их в IoC-контейнер.
Тут приходят BPP и настраивают эти бины с помощью 2х методов.
Готово.
 */

@Component
@Slf4j
//@InjectNewClass(newImpl = Dog.class)
@Getter
public class Animal {

    @InjectName(name = "dog astronaut")
    private String name;

    public Animal() {
        log.info("Привет из конструктора Animal");
    }

    @PostConstruct
    public void init() {
        log.info("привет из postConstruct");
    }

    public void output() {
        log.info("Привет из метода животного, меня зовут " + name);
    }

    @PreDestroy
    public void destroy() {
        log.info("привет из preDestroy");
    }

}
