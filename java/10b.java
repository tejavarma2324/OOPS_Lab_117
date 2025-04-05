Method overloading 2: class Display { public void show(int number) { System.out.println("Integer: " + number); }  

public void show(String message) {  
    System.out.println("Message: " + message);  
}  
 
public static void main(String[] args) {  
    Display obj = new Display();  
    obj.show(42);  
    obj.show("Polymorphism");  
}  
  

}  