package access.a;

/**
 * 접근 제어자 사용 - 필드, 메서드
 * 접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것이다.
 *
 * private - 나의 클래스 안으로 속성과 기능을 숨길 때 사용, 외부 클래스에서 해당 기능을 호출할 수 없다.
 * default - 나의 패키지 안으로 속성과 기능을 숨길 때 사용, 외부 패키지에서 해당 기능을 호출할 수 없다.
 * protected - 상속 관계로 속성과 기능을 숨길 때 사용, 상속 관계가 아닌 곳에서 해당 기능을 호출할 수 없다.
 * public - 기능을 숨기지 않고 어디서든 호출할 수 있게 공개한다.
 */
public class AccessData {
    public int publicFiled;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출: " + publicFiled);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출: " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출: " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicFiled = 100;
        defaultField = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
