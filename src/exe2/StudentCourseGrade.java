package exe2;

public class StudentCourseGrade {
    private int studentId;
    private int courseId;
    private int grade;

    public StudentCourseGrade(int studentId, int courseId, int grade){
        this.studentId = studentId;
        this.courseId = courseId;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getGrade() {
        return grade;
    }
}

