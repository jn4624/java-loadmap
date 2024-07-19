package nested.ex;

/**
 * 정적 중첩 클래스 생성
 */
public class OuterClass1 {
    static class NestedClass {
        public void hello() {
            System.out.println("NestedClass.hello");
        }
    }
}
