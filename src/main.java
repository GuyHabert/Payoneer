import exe2.CourseAvg;
import exe2.StudentCourse;
import exe2.StudentCourseGrade;
import exe2.StudentCoursesManger;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        // ------------ Q2 ------------
        List<StudentCourseGrade> items = new ArrayList<StudentCourseGrade>();
        items.add(new StudentCourseGrade(1,1123,34));
        items.add(new StudentCourseGrade(1,1124,88));
        items.add(new StudentCourseGrade(2,1123,65));

        // Q2 - part 1
        StudentCoursesManger manger = new StudentCoursesManger();
        manger.buildStudentCoursesMap(items);
        System.out.println(manger.getStudentCourseList(1));
        System.out.println(manger.getStudentCourseList(2));

        List<StudentCourse> allStudentCourse = manger.getAllStudentCourseList();
        for (StudentCourse currStudentCourse: allStudentCourse) {
            System.out.println(String.format("StudentId: %s , Courses: %s", currStudentCourse.getStudentId(), currStudentCourse.getCourses().toString()));
        }

        // Q2 - part 2
        manger.buildCourseGradesMap(items);
        List<CourseAvg> allCourseAvg = manger.getAllCourseAvgList();
        for (CourseAvg currCourseAvg: allCourseAvg) {
            System.out.println(String.format("CourseId: %s , CoursesAvg: %s", currCourseAvg.getCourseId(), currCourseAvg.getCourseAvg()));
        }
    }
}
