package lang.object;

/**
 * 부모가 없으면 묵시적으로 Object 클래스를 상속 받는다.
 * 상속 받은 부모 클래스가 없다면 자바가 extend Object 코드를 자동으로 추가해준다.
 * public class Parent extend Object 와 동일한 코드가 된다.
 */
public class Parent {
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
