package Java;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Ahmed", 24, 2.84);
        Student student2 = new Student("Dina", 22, 3.23);

        student1.displayInfo();
        student1.study();
        System.out.println("Age now is: " + student1.getAge());
        student1.setAge(26);
        System.out.println("Age after set is: " + student1.getAge());

        System.out.println("-------------------------------------");
        student2.displayInfo();
        student2.study();
        System.out.println("gpa now is: " + student2.getGpa());
        student2.setGpa(2.5);
        System.out.println("gpa after set is: " + student2.getGpa());

        System.out.println("-------------------------------------");


    }
}
