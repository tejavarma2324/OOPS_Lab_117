 Encapsulation 2: class Student { private String name; private int rollNumber; private int marks;  

public Student(String name, int rollNumber, int marks) {  
    this.name = name;  
    this.rollNumber = rollNumber;  
    setMarks(marks);  
}  
 
public void setMarks(int marks) {  
    if (marks >= 0 && marks <= 100) {  
        this.marks = marks;  
    } else {  
        System.out.println("Invalid marks! Setting marks to 0.");  
        this.marks = 0;  
    }  
}  
 
public int getMarks() {  
    return marks;  
}  
 
public void display() {  
    System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Marks: "  
  

marks); }  

public static void main(String[] args) { Student student = new Student("Alice", 101, 95); student.display(); } 

}  