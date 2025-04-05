 Abstract class 1: abstract class Animal { abstract void makeSound(); }  

class Dog extends Animal { public void makeSound() { System.out.println("Dog barks"); } }  

class Cat extends Animal { public void makeSound() { System.out.println("Cat meows"); } }  

public class AnimalTest { public static void main(String[] args) { Animal dog = new Dog(); Animal cat = new Cat();  

   dog.makeSound();  
    cat.makeSound();  
}  
  

}  