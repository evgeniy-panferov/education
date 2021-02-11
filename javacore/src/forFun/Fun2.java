package forFun;

public class Fun2 {

    static class MyException extends Exception {
    }

    static class MyException1 extends Exception {
    }

    public static void main(String[] args) throws MyException {
        try {
            throw new MyException();
        } catch (MyException e) {
            try {
                except();
            } catch (MyException exception) {
                System.out.println("1");
            }
        } finally {
            throw new MyException();
            //  System.out.println("2");
        }
    }

    public static void except() throws MyException, MyException1 {
        try {
            throw new MyException();
        } catch (Exception e) {
            System.out.println("3");
            throw new MyException1();
        } finally {
            System.out.println("4");
        }
    }
}
