package spring.exception;

import org.springframework.stereotype.Component;

@Component
public class ExceptionThrower {

    public String throwException() throws MyException {
        throw new MyException("Not work");
    }
}
