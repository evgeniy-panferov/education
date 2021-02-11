package forFun;

public class Fun1 {
    public static void main(String[] args) {
        String str = "Hi";
        String str1 = "Hi";
        String str2 = new String("Hi");

        System.out.println(str == str1);
        System.out.println(str == str2);
        System.out.println(str == str2.intern());

        Integer int1 = 111;
        Integer int2 = 111;
        Integer int3 = new Integer(111);
        Integer int4 = -130;
        Integer int5 = -130;
        Integer int6 = new Integer(-130);

        System.out.println(int1 == int2);
        System.out.println(int2 == int3);
        System.out.println(int4 == int5);
        System.out.println(int6 == int4);

    }
}
