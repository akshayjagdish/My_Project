import java.util.Scanner;

public class EmployeeManagment {
    public static void main(String[] args) {
        EmployeeManagementSystem EmpMS = new EmployeeManagementSystem();
        Scanner sc = new Scanner(System.in);
        int customerChoice = 0;
        while (customerChoice != 4) {
            System.out.println("Add Employee place----> 1");
            System.out.println("Remove Employee place----> 2");
            System.out.println("Dispaly Employee place----> 3");
            System.out.println("Exit Program Place----> 4");
            System.out.print("Enter Your Choice : ");
            customerChoice = sc.nextInt();
            sc.nextLine();

            switch (customerChoice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String empName = sc.nextLine();
                    System.out.print("Enter Employee Age: ");
                    int empAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double empSalary = sc.nextDouble();
                    sc.nextLine();
                    Employee var9 = new Employee(empId, empName, empAge, empSalary);
                    EmpMS.addEmployee(var9);
                    System.out.println("Employee added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Employee ID to remove: ");
                    int var10 = sc.nextInt();
                    sc.nextLine();
                    EmpMS.removeEmployee(var10);
                    System.out.println("Employee removed successfully!");
                    break;
                case 3:
                    System.out.println("List of Employees:");
                    EmpMS.displayEmployees();
                    break;
                case 4:
                    System.out.println("Exiting Employee Management System...");
                    break;

                default:
                    System.out.println("Invalid Choice. Try Again");
                    break;
            }
        }
    }
}
