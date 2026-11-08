// Multiple Inheritance (not Directly supported by Java)

/*
Like example--
    A    B
    \   /
      C

*/ 

public class Demo4 {
    public static void main(String[] args) {
        
    }
}

class A {
    String name;
    int age;
    void mark(){
        System.out.println("Marked!");
    }
}

class B{
    void start(){
        System.out.println("car Start by Suman Mandal");
    }
}

// class C extends A , B {
//     void not(){

//     }

// }

