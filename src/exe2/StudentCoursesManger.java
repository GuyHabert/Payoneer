package exe2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentCoursesManger {
    private HashMap <Integer, StudentCourse> studentCourseMap = new HashMap <Integer, StudentCourse>();
    private HashMap <Integer, CourseAvg> courseGradesMap = new HashMap <Integer, CourseAvg>();

    public void buildStudentCoursesMap(List<StudentCourseGrade> studentCourseGradeList){
        for (StudentCourseGrade studentCourseGrade: studentCourseGradeList) {
            int currentStudentId = studentCourseGrade.getStudentId();
            int currentCourseId = studentCourseGrade.getCourseId();

            if(studentCourseMap.containsKey(currentStudentId)){
                // Assuming there are no duplicates of the same course for the same student.
                studentCourseMap.get(currentStudentId).addCourse(currentCourseId);
            } else{
                ArrayList<Integer> courses = new ArrayList<>();
                courses.add(currentCourseId);
                studentCourseMap.put(currentStudentId, new StudentCourse(currentStudentId, courses));
            }
        }
    }

    private List<Integer> getCourseListByStudentId(int studentId){
        if(studentCourseMap.containsKey(studentId))
            return studentCourseMap.get(studentId).getCourses();
        return null;
    }

    public List<StudentCourse> getAllStudentCourseList(){
        return new ArrayList(studentCourseMap.values());
    }

    public void buildCourseGradesMap(List<StudentCourseGrade> studentCourseGradeList){
        for (StudentCourseGrade studentCourseGrade : studentCourseGradeList) {
            int currentCourseId = studentCourseGrade.getCourseId();
            int currentCourseGrade = studentCourseGrade.getGrade();

            if(courseGradesMap.containsKey(currentCourseId)){
                courseGradesMap.get(currentCourseId).addGrade(currentCourseGrade);
            } else{
                courseGradesMap.put(currentCourseId, new CourseAvg(currentCourseId, currentCourseGrade));
            }
        }
    }

    public List<CourseAvg> getAllCourseAvgList(){
        return new ArrayList(courseGradesMap.values());
    }

    public void printCoursesListByStudentId(int studentId){
        System.out.println(String.format("StudentId: %s , Courses: %s", studentId, getCourseListByStudentId(studentId)));
    }
}
