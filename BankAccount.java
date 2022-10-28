
public class BankAccount {
   
    private double balance;
    
    public BankAccount(){
        balance = 0;
        
    }
     
   public BankAccount(double initialBalance){
       balance = initialBalance;
    }
    
    
    void deposit(double amount){
        balance = balance + amount;
        
        
    }
    void withdrawl(double amount){
        //This if statement takees care of the insufficent funds message
        if(amount > balance){
            System.out.println("Insufficient funds");
            //The return does not allow the program to deduct the amount and keeps value
            return;
        }
        balance = balance - amount;
    }
    public double getbalance(){
        return balance;
    }
   // void display(){
       // System.out.println("========================");
     //   System.out.println("Balance " );
      //  System.out.println("========================"); }
}
