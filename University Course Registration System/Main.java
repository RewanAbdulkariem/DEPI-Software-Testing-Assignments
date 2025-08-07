public class Main {
    public static void main(String[] args){
        Course mathI = new Course("ECE121", "Calculus I", 3);
        Course cs = new Course("CSS102", "Introduction to Programming", 2);

        Student student = new Student("Rewan", "Communication & Electronics Engineering");

        System.out.println("Register Introduction to Programming:");
        boolean registered = student.registerCourse(cs);
        System.out.println("Registered: " + registered);

        System.out.println("Register Introduction to Programming again:");
        registered = student.registerCourse(cs);
        System.out.println("Registered: " + registered);

        System.out.println("Register for Calculus:");
        registered = student.registerCourse(mathI);
        System.out.println("Registered: " + registered);

        System.out.println("---------------------------------------------------------");
        Professor prof = new Professor("Dr. Ahmed", "Computer Engineering");
        prof.addCourse(cs);
        
        Person[] people = {student, prof};

        for (Person p : people) {
            p.getDetails();
        }
    }
}
