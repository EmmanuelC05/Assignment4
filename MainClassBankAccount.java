
public class MainClassBankAccount {

 
    public static void main(String[] args) {
        //  BankAccount mannyAccount = new BankAccount("Manny Castanon" , 20);
       //mannyAccount.owner = "Manny Castanon";
       // mannyAccount.balance = 20;
        
       // mannyAccount.deposit(80);
       //mannyAccount.withdrawl(50);
       //not taking control of over draft
       //mannyAccount.withdrawl(100);
        
       //System.out.println(mannyAccount.balance);
       // mannyAccount.display();
       
       //Creating another object without re writing the code all over agian.
       // BankAccount alanAccount = new BankAccount("Alan", 1000000);
       //alanAccount.owner = "Alan";
       //alanAccount.balance = 1000000;    
       // System.out.println(alanAccount.balance);
       // alanAccount.display();
       System.out.println("-------Sam's Savings Account-------");
       SavingsAccount samSavings = new SavingsAccount(250);
       System.out.println(+samSavings.getbalance());
       //samSavings.display();       
       
        System.out.println("-------Joe's Savings Account-------");
       SavingsAccount joeSavings = new SavingsAccount(100);
       joeSavings.withdrawl(25);
       joeSavings.withdrawl(500);
       System.out.println(+joeSavings.getbalance());
      // joeSavings.display();
       
        System.out.println("-------Emily's Checking Account-------");
       CheckingAccount emilyChecking = new CheckingAccount (200);
       emilyChecking.deposit(50);
       System.out.println(+emilyChecking.getbalance());
       emilyChecking.withdrawl(350);
       System.out.println(+emilyChecking.getbalance());
       emilyChecking.processCheck(50);
       System.out.println(+emilyChecking.getbalance());
       emilyChecking.withdrawl(500);
       System.out.println(+emilyChecking.getbalance());
      // emilyChecking.display();
       
       
    }
    
}
