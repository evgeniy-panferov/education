package abstraction;

public class Triangle extends Shape {

   private int a, b, c;

    @Override
    public void perimeter() {
        System.out.println(a+b+c);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

}
