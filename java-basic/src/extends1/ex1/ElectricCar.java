package extends1.ex1;

import extends1.ex3.Car;

public class ElectricCar extends Car {
    public void move() {
        System.out.println("차를 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
