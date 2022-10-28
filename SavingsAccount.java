
public class SavingsAccount extends BankAccount{
     private double interestRate;
     private double balance;
     
     public SavingsAccount(double initialBalance){
        super (initialBalance);
     }
    
    public void SavingsAccount(double rate){
        
        interestRate=rate;
        
    
    
}
    public void addinterest (){
        double interest = this.getbalance()*interestRate/100;
        this.deposit(interest);
    }
    
      public void deposit(double amount){
        balance = balance + amount;
        
        
    }
    public void withdrawl(double amount){
        //This if statement takees care of the insufficent funds message
        if(amount > balance){
            System.out.println("Insufficient funds");
            //The return does not allow the program to deduct the amount and keeps value
            return;
        }
        balance = balance - amount;
    }
   public void tranfer (BankAccount other,double amount){
        this.withdrawl(amount);
        other.deposit (amount);
                
               
    
    }
   // void annualInterestRate(double amount){
    //balance = amount * ;
            
    //}
            
            
       
            
            
            
    //public void display(){
        //System.out.println("========================");
       // System.out.println("Balance "+ balance);
       // System.out.println("========================");
}

     
