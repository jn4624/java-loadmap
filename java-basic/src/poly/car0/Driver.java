package poly.car0;

public class Driver {
    private K3Car k3Car;
    private Model3Car model3Car; // 추가

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) { // 추가
        this.model3Car = model3Car;
    }

    // 변경
    public void driver() {
        System.out.println("자동차를 운전합니다.");

        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
