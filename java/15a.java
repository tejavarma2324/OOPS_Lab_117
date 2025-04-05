 User-defined 1: CODE-1: package package1;  

public class Calculator { public int add(int a, int b) { return a + b; }  

public int subtract(int a, int b) {  
    return a - b;  
}  
 
public int multiply(int a, int b) {  
    return a * b;  
}  
  

}  

CODE-2: import package1.Calculator;  

public class PackageTest { public static void main(String[] args) { Calculator calc = new Calculator(); System.out.println("Addition: " + calc.add(5, 3)); System.out.println("Subtraction: " + calc.subtract(8, 2)); System.out.println("Multiplication: " + calc.multiply(4, 7)); } }  