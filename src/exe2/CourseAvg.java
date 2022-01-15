package exe2;

import java.util.ArrayList;
import java.util.List;

public class CourseAvg {
    private int courseId;
    private double gradesSum = 0;
    private double courseAvg = 0;
    private List<Integer> grades;

    public CourseAvg(int courseId, int grade) {
        this.courseId = courseId;
        this.grades = new ArrayList<Integer>();
        this.grades.add(grade);
        this.gradesSum += grade;
    }

    public int getCourseId() {
        return courseId;
    }

    public double getCourseAvg() {
        if(grades.size() > 0) {
            courseAvg = gradesSum / grades.size();
        }

        return courseAvg;
    }

    public void addGrade (int grade){
        this.grades.add(grade);
        this.gradesSum += grade;
    }
}
