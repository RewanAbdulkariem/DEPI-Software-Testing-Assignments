import java.util.ArrayList;

/**
 * Course class - represents an academic course in the system.
 * This class manages the basic information about the course
 * such a code, title and credit hours.
 * It contains information about students enrolled to this class.
 *
 * @author Rewan Khaled
 */
public class Course {
    // course information
    private String courseCode;      // Unique course code (e.g., CS101)
    private String courseTitle;     // Course name (e.g., Introduction to Programming)
    private int creditHours;        // Number of credit hours (valid range: 1-5)

    // A list of students enrolled to this course to have
    // the flexibility to add or remove a student for specific class
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    /**
     * Course constractor - creates a new course with basic information.
     * @param courseCode: unique course code.
     * @param courseTitle: course name
     * @param creditHours: number of credit hours
     */

    public Course(String courseCode, String courseTitle, int creditHours){
        // Using setters to ensure data validation during construction
        setCourseCode(courseCode);
        setCourseTitle(courseTitle);
        setCreditHours(creditHours);
    }

    /**
    * Add a student to the course enrollment list.
    *
    * @param student the student to be enrolled in this course
    */
    void  addStudent(Student student){
        enrolledStudents.add(student);
    }
    /**
     * Remove a student from the course enrollment list.
     *
     * @param student the student to be removed from this course
     */
    void removeStudent(Student student){
        enrolledStudents.remove(student);
    }

    // setters and getters for course code
    void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }
    String getCourseCode(){
        return courseCode;
    }

    // setters and getters for course name
    void setCourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }
    String getCourseTitle(){
        return courseTitle;
    }

    // setters and getters for course credit hours
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

    /**
     * Get all enrolled students as an array.
     *
     * @return array of all students enrolled in this course
     */
    Student[] getEnrolledStudents(){
        return enrolledStudents.toArray(new Student[0]);
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseTitle + " (" + creditHours + " credits)";
    }
}
