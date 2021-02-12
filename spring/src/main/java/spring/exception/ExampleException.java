package spring.exception;

import java.io.IOException;

public class ExampleException {

    public static void main(String[] args) {
        System.out.println("Result " + example());
    }

    public static Integer example() {
        try {
            throw new IOException();
        } catch (IOException e) {
            return 1;
        } finally {
            return 2;
        }
    }
}
