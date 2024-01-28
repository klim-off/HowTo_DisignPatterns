package creatinalPattern.factory.factor_y;

import creatinalPattern.factory.developers.Developer;
import creatinalPattern.factory.developers.JavaDeveloper;

public class JavaRush extends ProgrammingCourse{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
