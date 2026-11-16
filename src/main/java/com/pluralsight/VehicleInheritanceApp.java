package com.pluralsight;



public class VehicleInheritanceApp {

    public static void main(String[] args) {

        // Create a Moped
        Moped slowRide = new Moped();

        slowRide.setColor("Red");
        slowRide.setNumberOfPassengers(2);
        slowRide.setCargoCapacity(10);
        slowRide.setFuelCapacity(5);


        // Create a Car
        Car familyCar = new Car();

        familyCar.setColor("Blue");
        familyCar.setNumberOfPassengers(5);
        familyCar.setCargoCapacity(100);
        familyCar.setFuelCapacity(50);


        // Create a SemiTruck
        SemiTruck bigTruck = new SemiTruck();

        bigTruck.setColor("White");
        bigTruck.setNumberOfPassengers(2);
        bigTruck.setCargoCapacity(20000);
        bigTruck.setFuelCapacity(300);


        // Create a Hovercraft
        Hovercraft airRide = new Hovercraft();

        airRide.setColor("Black");
        airRide.setNumberOfPassengers(6);
        airRide.setCargoCapacity(500);
        airRide.setFuelCapacity(100);


        // Display Moped information
        System.out.println("MOPED");
        System.out.println("Color: " + slowRide.getColor());
        System.out.println("Passengers: " + slowRide.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + slowRide.getCargoCapacity());
        System.out.println("Fuel Capacity: " + slowRide.getFuelCapacity());

        // Display Car information
        System.out.println("\nCAR");
        System.out.println("Color: " + familyCar.getColor());
        System.out.println("Passengers: " + familyCar.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + familyCar.getCargoCapacity());
        System.out.println("Fuel Capacity: " + familyCar.getFuelCapacity());

        // Display SemiTruck information
        System.out.println("\nSEMI TRUCK");
        System.out.println("Color: " + bigTruck.getColor());
        System.out.println("Passengers: " + bigTruck.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + bigTruck.getCargoCapacity());
        System.out.println("Fuel Capacity: " + bigTruck.getFuelCapacity());

        // Display Hovercraft information
        System.out.println("\nHOVERCRAFT");
        System.out.println("Color: " + airRide.getColor());
        System.out.println("Passengers: " + airRide.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + airRide.getCargoCapacity());
        System.out.println("Fuel Capacity: " + airRide.getFuelCapacity());
    }
}



