public class Demo {
   public static void main(String[] args){
    Student s1 = new Student();
    s1.name = "Suman";
    s1.age =23;
    s1.roll = 234;
    s1.college = "NSHM Knowledge Campus";
    s1.markAttendence();
    s1.display();

    Student s2 = new Student();
    s2.name = "Aysika";
    s2.age = 21;
    s2.roll = 235;
    s2.college = "NSHM Knowledge Campus";
    s2.markAttendence();
    s2.display();

  } 
}

class Student{
    String name;
    int age;
    int roll;
    String college;
    void markAttendence(){
        System.out.println(name + " is present");
    }

    void display(){
        System.out.println("Name: " + name + ", Age: " + age + ", Roll: " + roll + ", College: " + college);
    }
}
