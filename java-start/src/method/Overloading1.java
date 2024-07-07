package method;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1. " + add(1, 2));
        System.out.println("2. " + add(1, 2, 3));
    }

    private static int add(int a, int b) {
        System.out.println("1. 호출");
        return a + b;
    }

    private static int add(int a, int b, int c) {
        System.out.println("2. 호출");
        return a + b + c;
    }
}
