// 3. Call parent class Constructor using Super KeyWords.

public class Demo3 {
    public static void main(String[] args) {
        EngineeringStudent es1 = new EngineeringStudent("Suman",23,234,"NSHM");
        es1.print();
    }
    
}


class Student{
    String name;
        int age;
     int rollNo;
    void print(){
        System.out.println(name+" , "+age+" , "+rollNo);
    }
    Student(){

    }

    Student(String name, int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;


    }

}

class EngineeringStudent extends Student{
    String college;
    EngineeringStudent(String name,int age,int rollNo, String college){
        super(name,age,rollNo);
        this.college = college;

    }
    void print(){
        super.print();
        System.out.println(college);
    }
    
}