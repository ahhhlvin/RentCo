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


        ArrayList<Generator> generators = new ArrayList<Generator>();
        generators.add(new Generator());
        generators.add(new Generator());
        generators.add(new Generator());
        generators.add(new Generator());
        generators.add(new Generator());

        for(int i=0; i<5; i++) {
            generateGenerator(generators);
            refillGenerator(generators);
        }





    }

    static void driveCars(ArrayList<Car> cars)
    {
        for (Car car : cars)
        {
            car.drive(new Random().nextInt(10));
            System.out.println("CAR - Gas remaining: "+ car.getGas());
        }
    }

    static void refillCars(ArrayList<Car> cars)
    {
        for (Car car : cars)
        {
            if(car.isEmpty())
            {
                car.refill();
                System.out.println("Refilling CAR...");
            }
        }
    }




    static void generateGenerator(ArrayList<Generator> generators)
    {
        for (Generator generator : generators)
        {
            generator.generate(new Random().nextInt(10));
            System.out.println("GENERATOR - Gas remaining: "+ generator.getGas());
        }
    }

    static void refillGenerator(ArrayList<Generator> generators)
    {
        for (Generator generator : generators)
        {
            if(generator.isEmpty())
            {
                generator.refill();
                System.out.println("Refilling GENERATOR...");
            }
        }
    }

}
