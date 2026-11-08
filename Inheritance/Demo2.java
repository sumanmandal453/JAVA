// multi- level Inheritance
/*
A --> B --> C
*/ 

public class Demo2 {
    public static void main(String[] args) {
        CSEEngineeringStudent cs = new CSEEngineeringStudent();

        
    }
}

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

class CSEEngineeringStudent extends EngineeringStudent{
    void CSELab(){
        System.out.println("CSE-Lab Attend!");
    }
}

