package spring.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import spring.beaninitialization.InjectName;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


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
@Data
public class Animal {

    @InjectName(name = "dog astronaut")
    @Size(min = 3, max = 10, message = "length sentence should be from 3 to 10 characters")
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
