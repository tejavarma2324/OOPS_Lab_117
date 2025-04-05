 Person class:  

class Person { 

 String name; 

 int age; 

 

 public Person(String name, int age){ 

 this.name = name; 

 this.age = age; 

 

 } 

 

 public void displayPerson() {  

System.out.println("Name: " + name + ", Age: " + age); 

 

}  

 

 

}  

  

class Employee extends Person {  

    double salary;  

  

    public Employee(String name, int age, double salary) {  

        super(name, age);  

        this.salary = salary;  

    }  

  

    public void displayEmployee() {  

        displayPerson();  

        System.out.println("Salary: $" + salary);  

    }  

}  

  

class Student extends Person {  

    String grade;  

  

    public Student(String name, int age, String grade) {  

        super(name, age);  

        this.grade = grade;  

    }  

  

    public void displayStudent() {  

        displayPerson();  

        System.out.println("Grade: " + grade);  

    }  

}  

  

class Intern extends Employee {  

    String internshipField;  

  

    public Intern(String name, int age, double salary, String internshipField) {  

        super(name, age, salary);  

        this.internshipField = internshipField;  

    }  

  

    public void displayIntern() {  

        displayEmployee();  

        System.out.println("Internship Field: " + internshipField);  

    }  

} 

public class HY1 {  

    public static void main(String[] args) {  

        Intern intern = new Intern("Alice", 22, 3000, "Software Development");  

        intern.displayIntern();  

    }  

} 

 