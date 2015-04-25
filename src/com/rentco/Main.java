package com.rentco;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList vehicles = new ArrayList();
        vehicles.add(new Car());
        vehicles.add(new Car());
        vehicles.add(new Car());
        vehicles.add(new Car());
        vehicles.add(new Car());
        vehicles.add(new Tractor());
        vehicles.add(new Tractor());
        vehicles.add(new Tractor());
        vehicles.add(new Tractor());
        vehicles.add(new Tractor());


        for(int i=0; i<5; i++)
        {
            driveVehicles(vehicles);
            refillVehicles(vehicles);
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

    static void driveVehicles(ArrayList<Car> vehicles)
    {
        for (Vehicle vehicle : vehicles)
        {
            vehicle.drive(new Random().nextInt(10));
            System.out.println(vehicle.getClass() + " - Gas remaining: "+ vehicle.getGas());
        }
    }

    static void refillVehicles(ArrayList<Vehicle> vehicles)
    {
        for (Vehicle vehicle : vehicles)
        {
            if(vehicle.isEmpty())
            {
                vehicle.refill();
                System.out.println("Refilling " + vehicle.getClass() + "...");
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
