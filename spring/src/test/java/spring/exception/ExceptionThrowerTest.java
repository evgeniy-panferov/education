package spring.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class ExceptionThrowerTest {

    @Autowired
    ExceptionThrower exceptionThrower;

    @Test
    void throwException() throws IOException {
        MyException myException = Assertions.assertThrows(MyException.class, () -> exceptionThrower.throwException());
        Assertions.assertEquals("Not work", myException.getMessage());
    }
}