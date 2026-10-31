public class Demo4{
    public static void main(String[] args) {
        Student s1 = new Student( "Aysika",21,234,"NSHM");
       System.out.println(s1.name);
    }

}

class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    Student(String name, int age, int rollNumner, String college){
        System.out.println("I am in first constructor!");
        this.name = name;
        this.age= age;
        this.rollNumber = rollNumner;
        this.college = college;
    }
}

