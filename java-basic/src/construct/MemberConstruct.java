package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;

        /**
         * this()라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다.
         * 참고로 this 는 인스턴스 자신의 참조값을 가리킨다.
         * 그래서 자신의 생성자를 호출한다고 생각하면 된다.
         *
         * 아래 코드는 첫번째 생성자 내부에서 두번째 생성자를 호출한다.
         * MemberConstruct(String name, int age) -> MemberConstruct(String name, int age, int grade)
         */
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name: " + name + " age: " + age + " grade: " + grade);

        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
