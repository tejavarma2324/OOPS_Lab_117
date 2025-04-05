Constructor 1: class Student { String name; int rollNumber;  

public Student(String name, int rollNumber) {  
    this.name = name;  
    this.rollNumber = rollNumber;  
}  
 
public void display() {  
    System.out.println("Student Name: " + name);  
    System.out.println("Roll Number: " + rollNumber);  
}  
 
public static void main(String[] args) {  
    Student s1 = new Student("Alice", 101);  
    s1.display();  
}  
  

}  