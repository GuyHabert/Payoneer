import java.util.List;

public class StudentCourse {
    private int studentId;
    private List<Integer> courses;

    public StudentCourse(int studentId, List<Integer> courses) {
        this.studentId = studentId;
        this.courses = courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public List<Integer> getCourses() {
        return courses;
    }

    public void addCourse(int course){
        this.courses.add(course);
    }


}


