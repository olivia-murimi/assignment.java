// Car.java
public class Car extends Vehicle {

    // Additional field for Car
    private int numberOfDoors;

    // Constructor
    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year); // Call the constructor of the superclass (Vehicle)
        this.numberOfDoors = numberOfDoors;
    }

    // Override the displayDetails method to include number of doors
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the displayDetails method of the superclass (Vehicle)
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}