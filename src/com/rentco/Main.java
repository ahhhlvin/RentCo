package com.rentco;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());

        for(int i=0; i<5; i++)
        {
            driveCars(cars);
            refillCars(cars);
        }
    }

    static void driveCars(ArrayList<Car> cars)
    {
        for (Car car : cars)
        {
            car.drive(new Random().nextInt(10));
            System.out.println("Gas remaining: "+ car.getGas());
        }
    }

    static void refillCars(ArrayList<Car> cars)
    {
        for (Car car : cars)
        {
            if(car.isEmpty())
            {
                car.refill();
                System.out.println("Refilling...");
            }
        }
    }
}
