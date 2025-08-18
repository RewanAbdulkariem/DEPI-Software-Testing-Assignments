import java.util.ArrayList;
/**
 * Professor class - represents a professor in the academic system.
 * This class extends the abstract Person class.
 *
 * Inheritance: Professor is a Person so it inherits from Person class.
 */
public class Professor extends Person{
    private String professorId;
    private String department;

    // A list of all courses taught by the professor.
    ArrayList<Course> teachingCourses = new ArrayList<>();

    /**
     * Professor constractor - creates a new professor.
     * @param professorId: each professor must have unique id
     * @param department
     */
    public Professor(String professorId, String department){
        setProfessorId(professorId);
        setDepartment(department);
    }
    // setters and getters for id
    void setProfessorId(String professorId){
        this.professorId = professorId;
    }
    String getProfessorId(){
        return  professorId;
    }

    // setters and getters for department
    void setDepartment(String department){
        this.department = department;
    }
    String getDepartment(){
        return department;
    }
    /**
     * AddCourse - add a course to teaching courses
     * @param course: course to be added
     */
    void addCourse(Course course){
        teachingCourses.add(course);
    }
    /**
     * removeCourse - remove a course from teaching courses
     * @param course: the course to be removed
     */
    void removeCourse(Course course){
        teachingCourses.remove(course);
    }

    /**
     * Implementation of abstract method from Person class.
     * Displays professor information including ID, department, and courses.
     */
    @Override
    void getDetails() {
        System.out.println("Professor id: " + professorId +
                           "\nDepartment: " + department + 
                           "\nTeachingCourses: " + teachingCourses);

    }
}
