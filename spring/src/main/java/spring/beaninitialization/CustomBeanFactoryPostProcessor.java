package spring.beaninitialization;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/*
 После парсинга Spring конфигурации(xml, annotation, groovy) создается массив BeanDefinition, они содержат метаданные класса, тут мы можем их подкрутить,
 например задать новую имплементацию.
 Сюда входит: из какого класса его (бин) надо создать; scope; установлена ли ленивая инициализация;
 нужно ли перед данным бином инициализировать другой и иные проперти, которые описаны в xml.
 Все полученные BeanDefinition’ы складываются в HashMap, в которой идентификатором является имя бина (установленное вами или присвоенное спрингом)
 и сам BeanDefinition объект.
 */

@Component
@Slf4j
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("Привет из CustomBeanFactoryPostProcessor");
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
            String beanClassName = beanDefinition.getBeanClassName();
            if (beanClassName != null) {
                try {
                    Class<?> aClass = Class.forName(beanClassName);
                    InjectNewClass annotation = aClass.getAnnotation(InjectNewClass.class);
                    if (annotation != null) {
                        log.info("Устанавливаю новый класс для класса" + beanClassName + "у него есть аннотация @InjectNewClass");
                        beanDefinition.setBeanClassName(annotation.newImpl().getName());
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
