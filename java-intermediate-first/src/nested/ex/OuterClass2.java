package nested.ex;

/**
 * 내부 클래스 생성
 */
public class OuterClass2 {
    class InnerClass {
        public void hello() {
            System.out.println("InnerClass.hello");
        }
    }
}
