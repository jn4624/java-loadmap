package nested.local;

import java.lang.reflect.Field;

public class LocalOuter4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거
        int localVar = 1;

        /**
         * 지역 클래스가 접근하는 지역 변수는 절대로 중간에 값이 변경되면 안된다.
         * 따라서 final 로 선언하거나 사실상 final 이어야 한다.
         * 이는 자바 문법이고 규칙이다.
         *
         * 1. 중간에 값이 변경되면 안되는 이유
         *    자바는 LocalPrinter 를 생성하는 시점에 지역 변수 localVar, paramVar 를 캡처한다.
         *    이후 localVar, paramVar 의 값을 변경하면 스택 영역에 존재하는 지역 변수의 값과 캡처 변수의 값이 서로 달라지는 문제가 발생하는데 이를 동기화 문제라 한다.
         *
         * 2. 캡처 변수의 값을 변경하지 못하는 이유
         *    지역 변수의 값을 변경하면 인스턴스에 캡처한 변수의 값도 변경해야 한다.
         *    반대로 인스턴스에 있는 캡처 변수의 값을 변경하면 해당 지역 변수의 값도 다시 변경해야 한다.
         *    개발자 입장에서 보면 예상하지 못한 곳에서 값이 변경될 수 있다. 이는 디버깅을 어렵게 한다.
         *    지역 변수의 값과 인스턴스에 있는 캡처 변수의 값을 서로 동기화 해야 하는데,
         *    멀티쓰레드 상황에서 이런 동기화는 매우 어렵고, 성능에 나쁜 영향을 줄 수 있다.
         *
         * 이 모든 문제는 캡처한 지역 변수의 값이 변하기 때문에 발생한다.
         * 자바는 캡처한 지역 변수의 값을 변하지 못하게 막아서 이런 복잡한 문제들을 근본적으로 차단한다.
         */
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스 변수는 지역 변수보다 오래 유지
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
//        localVar = 10; // 컴파일 오류
//        paramVar = 20; // 컴파일 오류
        return printer;
    }

    public static void main(String[] args) {
        LocalOuter4 localOuter = new LocalOuter4();
        Printer printer = localOuter.process(2);

        // printer.print()를 process()의 스택 프레임이 사라진 후 실행
        printer.print();

        // 캡처 변수 확인 코드 추가
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
