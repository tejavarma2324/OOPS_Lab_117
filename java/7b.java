) Grandparent class:  

class Grandparent {  

    void grandparentMethod() {  

        System.out.println("This is a grandparent");  

    }  

}  

  

class Parent1 extends Grandparent {  

    void parent1Method() {  

        System.out.println("This is from Parent1");  

    }  

}  

  

class Parent2 extends Grandparent {  

    void parent2Method() {  

        System.out.println("This is from Parent2");  

    }  

}  

  

class Child extends Parent1 {  

    Parent2 p2 = new Parent2();   

  

    void childMethod() {  

        System.out.println("This is the child class method");  

    }  

  

    void useParent2Methods() {  

        p2.parent2Method();   

    }  

    

  

}  

  

public class HY2 {  

    public static void main(String[] args) {  

        Child obj = new Child();  

        obj.grandparentMethod();   

        obj.parent1Method();   

        obj.useParent2Methods();   

        obj.childMethod();   

    }  

} 

 