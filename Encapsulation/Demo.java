// Implimentation of Encapsulation
public class Demo {
   public static void main(String[] args) {
    BankAccount ba = new BankAccount();
    // ba.balance = 2046860;
    // System.out.println(ba.balance);
    ba.deposit(500);
    ba.withDraw(200);
    System.out.println(ba.GetBalance());
   } 
}

class BankAccount{
   private double balance;

   public void deposit(int Amount){
    balance += Amount;
   }
   public void withDraw(int Amount){
    balance -= Amount;
   }
   // getter / Setters
   public double GetBalance(){
    return balance;
   }

}