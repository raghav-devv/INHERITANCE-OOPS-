package org.example;
//Define a subclass for cars that extends the Vehicle class
public class Car extends Vehicle{
    // Fields to store the car's brand and speed
   String brand;
    int speed;

    // Constructor to initialize the car's type, brand, and speed
    Car(String type,String brand,int speed){
        // Call the Vehicle constructor to set the type
        super(type);
        // Set the brand and speed fields
        this.brand=brand;
        this.speed=speed;
    }
    // Method to display the car's details
    public void valueof(){
        // Print the car's brand speed and type to the console
//it follows the pattern of calling to avoid confusion when we have multiple same type of data type!
        System.out.println("car type is:"+type+", model is: "+brand+", speed of:"+speed);
    // I call Vehicle type also in it , if i want i can directly call method that i created in vehicle class
    }
//// Main class to test the Car class
    public static void main(String[] args) {
        Car c1 = new Car("Electric","BMW",100);

        // Call the valueof method to display the car's details
        c1.valueof();
        //here i did not call typeof method that was present in the vehicle class

    }
}


