public class Employee {
    private int Id;
    private String Name;
    private int Age;
    private double Salary;

    public Employee(int empId, String empName, int empAge, double empSalary){
        this.Id = empId;
        this.Name = empName;
        this.Age = empAge;
        this.Salary = empSalary;
    }

    public int getId() {
      return this.Id;
   }

   public void setId(int empId) {
      this.Id = empId;
   }

   public String getName() {
      return this.Name;
   }

   public void setName(String empId) {
      this.Name = empId;
   }

   public int getAge() {
      return this.Age;
   }

   public void setAge(int empId) {
      this.Age = empId;
   }

   public double getSalary() {
      return this.Salary;
   }

   public void setSalary(double empId) {
      this.Salary = empId;
   }

   public String toString() {
      return "Employee [id=" + this.Id + ", name=" + this.Name + ", age=" + this.Age + ", salary=" + this.Salary + "]";
   }
}
