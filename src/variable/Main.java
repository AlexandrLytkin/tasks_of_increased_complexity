package variable;

public class Main {
    public static void main(String[] args) {
        variable1();
        variable2();
        variable3();
    }

    private static void variable1() {
        System.out.println("task:6");
        int a =12;
        int b = 27;
        int c = 44;
        int d =15;
        int e = 9;
        int result = a * (b + (c + d * e));
        System.out.println("result = " + result);
        int number = 0;
        while (result != 0) {
            number = number * 10 + result % 10;
            result = result / 10;
        }
        System.out.println("invert = "+number);
    }
    private static void variable2() {
        System.out.println("task:7");
        int a = 5;
        int b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+ a+" b = "+b);
    }

    private static void variable3() {
        System.out.println("task8");
        int a = 913;
        int b = a /10 % 10;
        System.out.println(b);
    }

}
