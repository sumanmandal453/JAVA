public class Demo {
    public static void main(String[] args){
        EngineeringStudent es = new EngineeringStudent();
        es.MarkAttendence();
        es.AttendLab();

        Student s1 = new Student();
        s1.MarkAttendence();
       // s1.AttendLab(); (wrong)

    }
    
}
/*
parent(Super Class) -----> Child(Sub Class)

*/

class Student{
    String name;
        int age;

        void MarkAttendence(){
          System.out.println("Attdendence Marked!");
        }
}

class EngineeringStudent extends Student{
    void AttendLab(){
        System.out.println("Lab Attend!");
    }
}