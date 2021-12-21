package com.company;

public class BmwSaloon {
    static int sallonSpase = 10;
    Bmw[] cars = new Bmw[sallonSpase];
    static int soldCars;
    static int producedCars;
    int lastCarIndex = -1;

    static void soldCars() {
        System.out.println("Number of sold cars is " + soldCars);
    }

    static void producedCars() {
        System.out.println("Number of produced cars is " + producedCars);
    }

    void addCar(Bmw bmw) {
        if (lastCarIndex < cars.length - 1) {
            cars[++lastCarIndex] = bmw;
            producedCars++;
            return;
        }
        System.out.println("No space in saloon: ");
    }

    Bmw[] sellCar(int number) {
        Bmw[] newcars = new Bmw[10];
        int j = 0;
        for (int i = 0; i < newcars.length; i++) {
            if (i != number - 1) {
                newcars[j] = cars[i];
                j++;
            }
        }
        soldCars++;
        cars = newcars;
        return cars;
    }

    void showCars() {
        int a = 1;
        for (int i = 0; i < cars.length; i++, a++) {
            if (cars[i] == null) {
                System.out.println(a + " Empty");
                continue;
            }
            System.out.println(a + " " + cars[i].model + " " + cars[i].color);
        }
        System.out.println();
        System.out.println();
    }
}
