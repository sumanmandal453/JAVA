public class Demo2 {
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println("name:" +s1.name);
        System.out.println("age:" +s1.age);
        System.out.println("Roll:" + s1.roll);
        System.out.println("College:" + s1.college);
        Student s2 = new Student( "Aysika", 21 , 235, "NSHM Knowledge Campus");
        System.out.println("name:" +s2.name);
        System.out.println("age:" +s2.age);
        System.out.println("Roll:" + s2.roll);
        System.out.println("College:" + s2.college);
    }
    
}
class Student{
    String name;
    int age;
    int roll;
    String college;

    Student(){
        name = "Suman";
        age = 23;
        roll = 234;
        college = "NSHM Knowledge Campus";
    }
    // Student(String a, int b, int c, String d){
    //     name = a;
    //     age = b;
    //     roll =c;
    //     college = d;
    // }
    Student(String name, int age, int roll, String college){
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.college = college;

         
    }

}

