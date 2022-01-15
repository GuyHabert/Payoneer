import exe1.Stock;
import exe2.CourseAvg;
import exe2.StudentCourse;
import exe2.StudentCourseGrade;
import exe2.StudentCoursesManger;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // ------------ Q1 ------------
        System.out.println("------------ Q1 ------------");
        int arr[] = { 5, 4, 9, 2, 8, 7, 7, 9, 6, 8 };
        System.out.println(String.format("Maximum profit is: %s", Stock.maximumProfit(arr)));

        // ------------ Q2 ------------
        List<StudentCourseGrade> items = new ArrayList<StudentCourseGrade>();
        items.add(new StudentCourseGrade(1,1123,34));
        items.add(new StudentCourseGrade(1,1124,88));
        items.add(new StudentCourseGrade(2,1123,65));

        // Q2 - part 1
        System.out.println("------------ Q2 - part 1 ------------");
        StudentCoursesManger manger = new StudentCoursesManger();
        manger.buildStudentCoursesMap(items);

        System.out.println("List of courses by student Id:");
        manger.printCoursesListByStudentId(1);

        System.out.println("List of courses of all exiting students:");
        List<StudentCourse> allStudentCourse = manger.getAllStudentCourseList();
        for (StudentCourse currStudentCourse: allStudentCourse) {
            System.out.println(String.format("StudentId: %s , Courses: %s", currStudentCourse.getStudentId(), currStudentCourse.getCourses().toString()));
        }

        System.out.println("------------ Q2 - part 2 ------------");
        // Q2 - part 2
        manger.buildCourseGradesMap(items);
        List<CourseAvg> allCourseAvg = manger.getAllCourseAvgList();
        for (CourseAvg currCourseAvg: allCourseAvg) {
            System.out.println(String.format("CourseId: %s , CourseAvg: %s", currCourseAvg.getCourseId(), currCourseAvg.getCourseAvg()));
        }

        System.out.println("------------ Q3 - The solution is under exe3 package ------------");
    }
}
