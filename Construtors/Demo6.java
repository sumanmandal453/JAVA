import java.util.*;

public class Demo6 {
    public static void main(String[] args){
        Student s1 = new Student();
        // Student s2 = new Student("Aysika");
        // Student s3 = new Student("Aysika",20);
        // Student s4 = new Student("Aysika",21,234);
        // Student s5 = new Student("Aysika",22,234,"NSHM");
        // System.out.println(s1.name);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
       
    }
}

class Student{
    String name;
        int age;
 int rollNumber;
 String college;

 Student(){
    this("Unknown");
    System.out.println("I am in first constructure!");
 }     //default constructor
 Student(String name){   //parametarized constructor
    // this.name = name;
    this(name,0);
    System.out.println("I am in Second constructor!");

 }
 Student(String name,int age){
    // this.name = name;
    // this.age  = age;
    this(name,age,0);
    System.out.println("I am in third constructor!");
 }
 Student(String name, int age, int rollNumber){
    // this.name = name;
    // this.age = age;
    // this.rollNumber = rollNumber;
    this(name,age,rollNumber,"Unknown");
    System.out.println("I am in fourth constructor!");

 }
 Student(String name, int age, int rollNumber, String college){
    this.name = name;
    this.age = age;
    this.rollNumber = rollNumber;
    this.college = college;
    System.out.println("I am in fifth constructor!");
 }
}
