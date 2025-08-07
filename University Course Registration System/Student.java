import java.util.ArrayList;

public class Student extends Person implements Registrable{
    private String studentId;
    private String major;

    ArrayList<Course> registeredCourses = new ArrayList<>();

    public Student(String studentId, String major){
        setStudentId(studentId);
        setMajor(major);
    }

    void setStudentId(String studentId){
        this.studentId = studentId;
    }
    String getStudentId(){
        return studentId;
    }

    void setMajor(String major){
        this.major = major;
    }
    String getMajor(){
        return major;
    }

    void addCourse(Course course){
        registeredCourses.add(course);
    }
    void removeCourse(Course course){
        registeredCourses.remove(course);
    }
    @Override
    void getDetails() {
        System.out.println("Student ID: " + studentId
                            + "\nMajor: " + major
                            + "\nRegistered courses: " + registeredCourses);
    }

    @Override
    public boolean registerCourse(Course course) {
        if (registeredCourses.contains(course)) {
            return false;
        }
        addCourse((course));
        return true;
    }

    @Override
    public boolean dropCourse(Course course) {
        return registeredCourses.remove(course);
    }
}
