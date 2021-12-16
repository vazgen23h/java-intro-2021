package com.company;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        BmwSaloon saloon = new BmwSaloon();
        Bmw car1 = new Bmw("M6", "Red");
        Bmw car2 = new Bmw("M8", "Black");
        Bmw car3 = new Bmw("M3", "Blue");
        Bmw car4 = new Bmw("M6", "Black");
        Bmw car5 = new Bmw("M2", "White");

        saloon.addCar(car1);
        saloon.addCar(car2);
        saloon.addCar(car3);
        saloon.addCar(car4);
        saloon.addCar(car5);
        saloon.showCars();
        saloon.sellCar(2);
        saloon.showCars();

        BmwSaloon.producedCars();
    }
}
