Method overriding 2: class Bank { public double getInterestRate() { return 5.0; 

 }  

}  

class SBI extends Bank { @Override public double getInterestRate() { return 6.5; 

 }  

}  

class HDFC extends Bank { @Override public double getInterestRate() { return 7.0; } }  

public class Main { public static void main(String[] args) { Bank b = new Bank(); SBI sbi = new SBI(); HDFC hdfc = new HDFC();  

   System.out.println("Bank Interest Rate: " + b.getInterestRate() + "%");  
    System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");  
    System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");  
}  
  

}  