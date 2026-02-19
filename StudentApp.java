// StudentApp.java
import java.util.Scanner;

public class StudentApp {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        // Create StudentRecord object
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Display student details
        student.displayInfo();

        scanner.close();
    }
}
