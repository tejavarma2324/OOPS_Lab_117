Abstract class 2: abstract class Shape { abstract double calculateArea(); }  

class Circle extends Shape { double radius;  

public Circle(double radius) {  
    this.radius = radius;  
}  
 
public double calculateArea() {  
    return Math.PI * radius * radius;  
}  
  

}  

class Rectangle extends Shape { double length, breadth;  

public Rectangle(double length, double breadth) {  
    this.length = length;  
    this.breadth = breadth;  
}  
 
public double calculateArea() {  
    return length * breadth;  
}  
  

}  

public class ShapeTest { public static void main(String[] args) { Shape circle = new Circle(5); Shape rectangle = new Rectangle(4, 6);  

   System.out.println("Circle Area: " + circle.calculateArea());  
    System.out.println("Rectangle Area: " + rectangle.calculateArea());  
}  
  

}  