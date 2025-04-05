Constructor 2: class Rectangle { double length, breadth;  

// Constructor  
public Rectangle(double length, double breadth) {  
    this.length = length;  
    this.breadth = breadth;  
}  
 
// Method to calculate and return area  
public double getArea() {  
    return length * breadth;  
}  
 
public static void main(String[] args) {  
     Rectangle rect = new Rectangle(5.0, 3.0);  
    System.out.println("Area of Rectangle: " + rect.getArea());  
}  
  

}  