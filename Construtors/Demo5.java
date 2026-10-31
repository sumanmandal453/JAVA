/*
Constructor chaning using this key-words this is a special keyword.
one constructor call by another constructor.
*/
import java.util.*;

public class Demo5 {
    public static void main(String[] args){
        // Student s1 = new Student();
        // Student s2 = new Student("Aysika");
        // Student s3 = new Student("Aysika",20);
        // Student s4 = new Student("Aysika",21,234);
        // Student s5 = new Student("Aysika",22,234,"NSHM");
        // // System.out.println(s1.name);
        // System.out.println(s3.rollNumber);
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the name: ");
        String a = sc.nextLine();
        System.out.print("Enter the age: ");
        int b = sc.nextInt();
        System.out.print("Enter the rollNumber: ");
        int c = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the college: ");
        String d = sc.nextLine();

     Student s1 =new Student(a,b,c,d);
     System.out.println("Student Details: ");
     System.out.println("name: "+s1.name);
     System.out.println("age :"+s1.age);
     System.out.println("rollNumber :"+s1.rollNumber);
     System.out.println("College :"+s1.college);

    }
}

class Student{
    String name;
        int age;
 int rollNumber;
 String college;

 Student(){
    this("Unknown",0,0,"Unknown");
 }     //default constructor
 Student(String name){   //parametarized constructor
    // this.name = name;
    this(name,0,0,"Unknown");

 }
 Student(String name,int age){
    // this.name = name;
    // this.age  = age;
    this(name,age,0,"Unknown");
 }
 Student(String name, int age, int rollNumber){
    // this.name = name;
    // this.age = age;
    // this.rollNumber = rollNumber;
    this(name,age,rollNumber,"Unknown");

 }
 Student(String name, int age, int rollNumber, String college){
    this.name = name;
    this.age = age;
    this.rollNumber = rollNumber;
    this.college = college;
 }

}

