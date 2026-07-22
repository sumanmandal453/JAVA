interface Myclass{
    void connect();
    void disconnect();
 } 
 abstract class OracleDB implements Myclass{
     abstract public void connect();
    abstract public void disconnect();
 }
 class supabaseDB implements Myclass{
     public void connect(){
        System.out.println("Connected to Supabase Database");
    }
     public void disconnect(){
        System.out.println("Disconnected from Supabase Database");
    }
}



public class Interface {
    // public static void main(String[] args) throws Exception {
    //     Class<?> c=Class.forName(args[0]);
    //     Myclass mi=(Myclass)c.getDeclaredConstructor().newInstance();
    //     mi.connect();
    //     mi.disconnect();
    // }


    // public static void main(String[] args) {
    //     Myclass obj;
    //     if (args[0].equals("oracle")) {
    //         // obj=new OracleDB();
    //     }
    //     else{
    //         obj=new supabaseDB();
    //     }
    //     obj.connect();
    //     obj.disconnect();
    // }


public static void main(String[] args) {
    Myclass obj = new supabaseDB();
     obj.connect();
     obj.disconnect();
}
}