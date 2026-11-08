// 1. To access parent class Variable.
public class Demo {
    public static void main(String[] args) {
        EngineeringStudent es1 = new EngineeringStudent();
        es1.name = "Suman";
        es1.age = 23;
        es1.rollNo = 234;
        es1.x = 4;
        es1.college = "NSHM";
        es1.print();

        
    }
    
}

class Student{
    String name;
        int age;
     int rollNo;
          int x;

}


class EngineeringStudent extends Student{
    String college;
             int x;
    void print(){
        System.out.println(super.name+" , "+super.age+" , "+super.rollNo+" , "+ x);
    }
}