package spring.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog extends Animal {
    @Override
    public void output() {
        log.info("Я собака");
    }
}
