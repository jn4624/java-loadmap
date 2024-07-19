package nested.local;

public class LocalOuter1 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        // 지역 변수
        int localVar = 1;

        // 지역 클래스
        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuter1 localOuter = new LocalOuter1();
        localOuter.process(2);
    }
}
