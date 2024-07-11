package poly.car0;

/**
 * 역할과 구현을 분리하지 않고 단순하게 개발
 */
public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.driver();

        System.out.println();

        // 추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.driver();
    }
}
