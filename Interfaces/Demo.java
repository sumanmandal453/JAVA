interface Car{
    void drive();
}

// class Thar implements Car{

//     @Override
//     public void drive() {
//         System.out.println("Driving Thar");
//     }
    
// }
abstract class Thar implements Car{
    @Override
    abstract public void drive();
    }
    
class BlackThar extends Thar{

    @Override
    public void drive() {
        System.out.println("Driving Black Thar");
    }
    
}

// public class Demo {
//     public static void main(String[] args) {
//         Thar v =new Thar();
//             v.drive();
//     }
 
// }

public class Demo {
    public static void main(String[] args) {
        Thar v =new BlackThar();
            v.drive();
    }
 
}
