package org.example;
// Define a base class for vehicles
public class Vehicle {
    // Field to store the type of vehicle
    String type;

    // Constructor to initialize the vehicle type
    Vehicle(String type){
        // Set the type field to the provided type
        this.type=type;
    }

    // Method to display the vehicle type
    public void typeof(){
        // Print the vehicle type to the console
        System.out.println("Vehicle type is:"+type);
    }
}
