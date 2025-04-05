Code: class Vehicle { 

    Vehicle() { 

        System.out.println("Vehicle is created."); 

    } 

} 

class Car extends Vehicle { 

    Car() { 

        System.out.println("Car is created."); 

    } 

} 

public class SingleInheritanceExample { 

    public static void main(String[] args) { 

        Car myCar = new Car(); // Calls both parent and child constructors 

    } 

} 