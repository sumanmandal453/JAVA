// Hierarchical Inheritance

/*
like Example--
      A
    /   \
    B    C

*/ 


public class Demo3 {
    public static void main(String[] args) {
        
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

class MedicalStudent extends Student{
    void MedicalLab(){
        System.out.println("Medical-Lab Attend!");
    }
}

