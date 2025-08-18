import java.util.ArrayList;
/**
 * Student class - represents a student in the academic system.
 *
 * This class extends the abstract Person class and implements the Registrable interface.
 *
 * Inheritance: Student is a Person so it inherits from Person class.
 * Interface: Student can register so it implements Registrable.
 */
public class Student extends Person implements Registrable{
    private String studentId;       // unique id for each student
    private String major;           // student major of field of study

    // A list of all courses registered by the student.
    ArrayList<Course> registeredCourses = new ArrayList<>();

    /**
     * Student constractor - creates a new student.
     * @param studentId: each student must have unique id
     * @param major: major of study for the student
     */
    public Student(String studentId, String major){
        setStudentId(studentId);
        setMajor(major);
    }

    // setters and getters for id
    void setStudentId(String studentId){
        this.studentId = studentId;
    }
    String getStudentId(){
        return studentId;
    }

    // setters and getters for major
    void setMajor(String major){
        this.major = major;
    }
    String getMajor(){
        return major;
    }

    /**
     * AddCourse - add a course to the registered student courses
     * @param course: course to be added
     *
     * Note: This is a private helper method used internally.
     */
    private void addCourse(Course course){
        registeredCourses.add(course);
    }
    /**
     * registerCourse - method to register a course with validation
     * to check if wasn't registered before
     * @param course: course to be registered
     * @return true if it can be registered else false
     */
    @Override
    public boolean registerCourse(Course course) {
        if (registeredCourses.contains(course)) {
            return false;
        }
        addCourse((course));
        return true;
    }
    /**
     * removeCourse - remove a course from registered courses
     * @param course: the course to be removed
     *
     * Note: This is a private helper method used internally.
     */
    private void removeCourse(Course course){
        registeredCourses.remove(course);
    }
    /**
     * dropCourse - method to drop a course with validation
     * to check if was registered before
     * @param course: course to be removed
     * @return true if it can be removed else false
     */
    @Override
    public boolean dropCourse(Course course) {
        if (registeredCourses.contains(course)){
            removeCourse(course);
            return true;
        }
        return false;
    }

    /**
     * Implementation of abstract method from Person class.
     * Displays student information including ID, major, and courses.
     */

     @Override
    void getDetails() {
        System.out.println("Student ID: " + studentId
                            + "\nMajor: " + major
                            + "\nRegistered courses: " + registeredCourses);
    }

}
