import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentCoursesManger {
    private Map<Integer, StudentCourse> studentCourseMap;

    public void buildStudentCoursesMap(List<StudentCourseGrade> studentCourseGradeList){
        for (StudentCourseGrade studentCourseGrade: studentCourseGradeList) {
            int currentStudentId = studentCourseGrade.getStudentId();
            int currentCourseId = studentCourseGrade.getCourseId();

            if(studentCourseMap.containsKey(currentStudentId)){
                // Assuming there are no duplicates of the same course for the same student.
                studentCourseMap.get(currentStudentId).addCourse(currentCourseId);
            }
            else{
                studentCourseMap.put(currentStudentId, new StudentCourse(currentStudentId, new ArrayList<Integer>(currentCourseId)));
            }
        }
    }

    public List<Integer> getStudentCourseList(int studentId){
        if(studentCourseMap.containsKey(studentId))
            return studentCourseMap.get(studentId).getCourses();
        return null;
    }
}
