User-defined 2: CODE-1: package package2;  

public class EmployeeDetails { private String name; private int id; private double salary;  

public EmployeeDetails(String name, int id, double salary) {  
    this.name = name;  
    this.id = id;  
    this.salary = salary;  
}  
 
public void display() {  
    System.out.println("Employee: " + name + ", ID: " + id + ", Salary: $" + salary);  
}  
  

}  

CODE-2: import package2.EmployeeDetails;  

public class EmployeeTest { public static void main(String[] args) { EmployeeDetails emp = new EmployeeDetails("John Doe", 101, 6000); emp.display(); } } 