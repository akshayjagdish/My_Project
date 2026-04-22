import java.util.ArrayList;

public class EmployeeManagementSystem {
    private ArrayList<Employee> employees = new ArrayList<>();
    
    EmployeeManagementSystem(){

    }

    public void addEmployee(Employee Add_Emp){
        this.employees.add( Add_Emp);
    }

    public void removeEmployee(int Add_Emp){
        for (int var2 = 0; var2 < this.employees.size(); ++var2){
            Employee removeEmp = (Employee)this.employees.get(var2);
            if (removeEmp.getId() == Add_Emp) {
                this.employees.remove(removeEmp);
                break;
            }
        }
    }

    public void displayEmployees() {
        for (Employee var2 : this.employees){
            System.out.println(var2);
        }
    }

}
