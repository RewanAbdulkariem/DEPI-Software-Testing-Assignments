import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseTitle;
    private int creditHours;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseCode, String courseTitle, int creditHours){
        setCourseCode(courseCode);
        setCourseTitle(courseTitle);
        setCreditHours(creditHours);
    }

    void  addStudent(Student student){
        enrolledStudents.add(student);
    }
    void removeStudent(Student student){
        enrolledStudents.remove(student);
    }

    void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }
    String getCourseCode(){
        return courseCode;
    }

    void setCourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }
    String getCourseTitle(){
        return courseTitle;
    }

    void setCreditHours(int creditHours){
        if (creditHours > 5 || creditHours < 1){
            this.creditHours = 0;
        } else {
            this.creditHours = creditHours;
        }
    }
    int getCreditHours(){
        return creditHours;
    }

    Student[] getEnrolledStudents(){
        return enrolledStudents.toArray(new Student[0]);
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseTitle + " (" + creditHours + " credits)";
    }
}
