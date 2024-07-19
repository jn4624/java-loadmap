package nested.local;

import java.lang.reflect.Field;

public class LocalOuter3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거
        int localVar = 1;

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
//        printer.print(); 이 시점에 실행하지 않고 인스턴스만 반환
        return printer;
    }

    public static void main(String[] args) {
        LocalOuter3 localOuter = new LocalOuter3();
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
