package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {
    private T bioUnit;

    public void in(T bioUnit) {
        this.bioUnit = bioUnit;
    }

    public T out() {
        return bioUnit;
    }

    public void showInfo() {
        System.out.println("이름: " + bioUnit.getName() + ", HP: " + bioUnit.getHp());
    }
}
