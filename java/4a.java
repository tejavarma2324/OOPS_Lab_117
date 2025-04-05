class Animal { 

    void sound() { 

        System.out.println("Animals make different sounds."); 

    } 

} 

class Dog extends Animal { 

    void bark() { 

        System.out.println("Dog barks: Woof Woof!"); 

    } 

} 

public class SingleInheritance { 

    public static void main(String[] args) { 

        Dog myDog = new Dog(); 

        myDog.sound();  // Calling method from parent class 

        myDog.bark();   // Calling method from child class 

    } 

} 