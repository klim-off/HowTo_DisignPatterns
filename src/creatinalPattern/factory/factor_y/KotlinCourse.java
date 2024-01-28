package creatinalPattern.factory.factor_y;

import creatinalPattern.factory.developers.Developer;
import creatinalPattern.factory.developers.KotlinDeveloper;

public class KotlinCourse extends ProgrammingCourse{
    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
