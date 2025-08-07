import java.util.ArrayList;

public class Professor extends Person{
    private String professorId;
    private String department;

    ArrayList<Course> teachingCourses = new ArrayList<>();

    public Professor(String professorId, String department){
        setProfessorId(professorId);
        setDepartment(department);
    }

    void setProfessorId(String professorId){
        this.professorId = professorId;
    }
    String getProfessorId(){
        return  professorId;
    }

    void setDepartment(String department){
        this.department = department;
    }
    String getDepartment(){
        return department;
    }

    void addCourse(Course course){
        teachingCourses.add(course);
    }
    void removeCourse(Course course){
        teachingCourses.remove(course);
    }

    @Override
    void getDetails() {
        System.out.println("Professor id: " + professorId +
                           "\nDepartment: " + department + 
                           "\nTeachingCourses: " + teachingCourses);

    }
}
