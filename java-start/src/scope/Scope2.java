package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;

        for (int i = 0; i <= 2; i++) {
            // 블록 내부에서 블록 외부는 접근 가능
            System.out.println("if m = " + m);
            System.out.println("if i = " + i);
        }

        // 오류, 변수 x에 접근 불가
//        System.out.println("main i = " + i);
        System.out.println("main m = " + m);
    }
}
