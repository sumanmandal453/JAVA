// static Keyword

public class Demo {
    public static void main(String[] args){
        Student s1 = new Student("Suman",23,234);
        Student s2 = new Student("Aysika",19,235);
        // Student.college = "NSHM Knowledge Campus";

        System.out.println(s1.name+" , "+s1.age+" , "+s1.rollNo+" , "+s1.college);
        System.out.println(s2.name+" , "+s2.age+" , "+s2.rollNo+" , "+s2.college);

        System.out.println(s2.name+" , "+s2.age+" , "+s2.rollNo+" , "+Student.college);
    }
    
}

class Student{
    String name;
    int age;
    int rollNo;
    static String college;
    // or we can write  
    // static String college = "NSHM";
    static int grade;

    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo; 
    }

    // static block
    static{
        // all static variable are we can assigen here
        college = "NSHM Knowledge Campus";
        grade = 25; // i enter a random grade
    }
}