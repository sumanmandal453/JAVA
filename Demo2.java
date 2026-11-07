// import college.Student;
// import school.Student;

import college.*;
import school.*;

// import packageName.ClassName

public class Demo2 {
    public static void main(String[] args){
        //   Student s1 = new Student();
        // or
        college.Student s1 = new college.Student();
        s1.print();

    
    school.Student s2 = new school.Student();
           s2.print();
}
}
