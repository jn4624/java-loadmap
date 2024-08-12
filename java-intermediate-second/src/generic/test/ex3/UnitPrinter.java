package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T bioUnit = t1.out();
        System.out.println("이름: " + bioUnit.getName() + ", HP: " + bioUnit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> t1) {
        BioUnit bioUnit = t1.out();
        System.out.println("이름: " + bioUnit.getName() + ", HP: " + bioUnit.getHp());
    }
}
