// getters / Setters

public class Demo2 {
    public static void main(String[] args){
        Student s1 = new Student("Suman",100,23,"NSHM");
        System.out.println(s1.getName());
        s1.setName("Arjun");
        System.out.println(s1.getName());


    }
    
}

class Student{
    private String name;
    private int rollNumber;
    private int age;
    private String college;

    Student(String name, int rollNumber, int age, String college){
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.college = college;

    }
    // getters / Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

      public String getCollege(){
        return college;
    }

    public void setCollege(String college){
        // validation ---> college Should be real.
        this.college = college;
    }

}
