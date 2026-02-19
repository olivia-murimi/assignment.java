// Showroom.java
import java.util.Scanner;

public class Showroom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter Car Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Car Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Create Car object
        Car car = new Car(brand, model, year, fuelType);

        // Display details
        car.displayDetails();

        scanner.close();
    }
}
