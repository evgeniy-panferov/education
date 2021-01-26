package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
// AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("education.spring");
    //context.getBean(Animal.class).output();
}
