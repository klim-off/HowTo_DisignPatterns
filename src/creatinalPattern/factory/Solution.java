package creatinalPattern.factory;
//
import creatinalPattern.factory.factor_y.DotNetCourse;
import creatinalPattern.factory.factor_y.JavaRush;
import creatinalPattern.factory.factor_y.KotlinCourse;
import creatinalPattern.factory.factor_y.ProgrammingCourse;

/* 
Кузница кадров
*/

public class Solution {

    private static ProgrammingCourse course;

    public static void main(String[] args) {
        choose("web");
        startLearningProcess();
    }

    static void choose(String direction) {
        if (direction.equals("web")) {
            course = new JavaRush();
        } else if (direction.equals("android")) {
            course = new KotlinCourse();
        } else {
            course = new DotNetCourse();
        }
    }

    static void startLearningProcess() {
        course.educateStudent();
    }
}
