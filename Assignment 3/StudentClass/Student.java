package Java;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        }
    public void displayInfo(){
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", GPA: " + this.gpa);
    }
    public void study(){
        System.out.println(this.name + " is studying now.....");
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getGpa(){
        return this.gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
}
