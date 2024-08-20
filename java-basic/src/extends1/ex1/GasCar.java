package extends1.ex1;

import extends1.ex3.Car;

public class GasCar extends Car {
    public void move() {
        System.out.println("차를 이동합니다.");
    }

    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}
