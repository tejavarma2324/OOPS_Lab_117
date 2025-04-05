Interface 4: interface BankAccount { void deposit(double amount); void withdraw(double amount); double getBalance(); }  

class SavingsAccount implements BankAccount { private double balance;  

public SavingsAccount(double initialBalance) {  
    this.balance = initialBalance;  
}  
 
public void deposit(double amount) {  
    balance += amount;  
    System.out.println("Deposited: $" + amount);  
}  
 
public void withdraw(double amount) {  
    if (amount <= balance) {  
        balance -= amount;  
        System.out.println("Withdrawn: $" + amount);  
    } else {  
        System.out.println("Insufficient balance!");  
    }  
}  
 
public double getBalance() {  
    return balance;  
}  
 
public static void main(String[] args) {  
    SavingsAccount account = new SavingsAccount(1000);  
    account.deposit(500);  
    account.withdraw(300);  
    System.out.println("Current Balance: $" + account.getBalance());  
}  
  

} 