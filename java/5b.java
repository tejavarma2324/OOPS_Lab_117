public class I4{  

public static void main(String[]args){  

rect r1=new rect();  

r1.area(2,3);  

square s1=new square();  

s1.area(6);  

}  

}  

  

class Shape{  

void area(){  

System.out.println("This can Calculate area of rectangle and square");  

}  

}  

class rect extends Shape{  

void area(int a,int b){  

System.out.println("Area Of rectangle is: "+(a*b));  

}  

}  

class square extends rect{  

void area(int a){  

System.out.println("Area Of Square is: "+(a*a));  

}  

} 

 