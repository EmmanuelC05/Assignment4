
public class CheckingAccount extends BankAccount{
      
    public double balance;

    public CheckingAccount(double initialBalance){
        super(initialBalance);
      
    }
    
    
   public void deposit(double amount){
        super.deposit(amount);
        
        
    }
    public void withdrawl(double amount){
        //This if statement takees care of the insufficent funds message
        if(amount > balance){
            System.out.println("Insufficient funds! A $10 transaction fee will be taken from your account");
            //The return does not allow the program to deduct the amount and keeps value
            
        }
        super.withdrawl(amount - 10);
    }
    public void processCheck (double amount){
         super.deposit(amount);

    }
    
    public void display(){
        System.out.println("========================");
        System.out.println("Checking Balance "+ balance);
        System.out.println("========================");
}
}
    
