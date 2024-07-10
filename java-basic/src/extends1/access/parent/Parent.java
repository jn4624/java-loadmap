package extends1.access.parent;

/**
 * 상속의 접근제어자
 *
 * private - 모든 외부 호출을 막는다.
 * default(package-private) - 같은 패키지안에서 호출은 허용한다.
 * protected - 같은 패키지안에서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
 * public - 모든 외부 호출을 허용한다.
 */
public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printParent() {
        System.out.println("=== Parent 메서드 안 ===");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue); // 부모 메서드 안에서 접근 가능
        System.out.println("privateValue = " + privateValue); // 부모 메서드 안에서 접근 가능

        // 부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }
}
