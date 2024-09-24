// File: StudentManagementApp.java
import java.util.Scanner;

public class EmployeeManagementApp {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. View Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.next();
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter department: ");
                    String department = scanner.next();
                    System.out.print("Enter designation: ");
                    String designation = scanner.next();
                    manager.addEmployee(new Employee(id, name, age, department, designation));
                    break;
                case 2:
                    System.out.print("Enter Employee ID to update: ");
                    String updateId = scanner.next();
                    System.out.print("Enter new name: ");
                    String newName = scanner.next();
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    System.out.print("Enter new department: ");
                    String newDept = scanner.next();
                    System.out.print("Enter new designation: ");
                    String newDesignation = scanner.next();
                    manager.updateEmployee(updateId, newName, newAge, newDept, newDesignation);
                    break;
                case 3:
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = scanner.next();
                    manager.deleteEmployee(deleteId);
                    break;
                case 4:
                    System.out.print("Enter employee ID to view: ");
                    String viewId = scanner.next();
                    manager.viewStudent(viewId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

