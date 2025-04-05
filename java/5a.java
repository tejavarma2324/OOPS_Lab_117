: public class I3{  

public static void main(String[]args){  

Car c1=new BMW();  

BMW b1=new BMW();  

Car c2=new Car();  

BMW t3=new BMWTruck();  

BMWTruck t4=new BMWTruck();  

t3.stt();  

t3.drive();  

t4.stt();  

t4.drive();  

t4.offroad();  

c1.stt();  

b1.stt();  

b1.drive();  

}  

}  

class Car{  

void stt(){  

System.out.println("Car Starts");  

}  

}  

class BMW extends Car{  

void drive(){  

System.out.println("BMW Is Driven");  

}  

}  

class BMWTruck extends BMW{  

void offroad(){  

System.out.println("Offroad is supported with ease");  

}} 