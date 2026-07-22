public class Demo2 {
    public static void main(String[] args) {
        Payment p= new CreditCardPayment();
        p.pay();
    
}
}

// polymorphism with interfaces(Dynamic polymorphism)
interface Payment {
    void pay();
}

class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying with credit card");
    }
    
}

class DebitCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying with debit card");
    }
    
}