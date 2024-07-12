package lang.object;

/**
 * 명시적으로 Parent 를 상속 받았기 때문에
 * 자바가 자동으로 extends Object 를 추가해주지 않는다.
 */
public class Child extends Parent {
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
