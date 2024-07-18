package nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    /**
     * Engine 에서만 사용하는 메서드들
     */
    public String getModel() {
        return model;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start() {
        this.engine.start();
        System.out.println(this.model + " 구동 완료");
    }
}
