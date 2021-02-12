package spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import spring.exception.MySecondException;

@ControllerAdvice
@Slf4j
public class DefaultAdvice {

    @ExceptionHandler(MySecondException.class)
    public String error() {
        log.info("Controller advice");
        return "cookie";
    }
}
