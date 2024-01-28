package creatinalPattern.factory.factor_y;

import creatinalPattern.factory.developers.Developer;
import creatinalPattern.factory.developers.DotNetDeveloper;

public class DotNetCourse extends ProgrammingCourse{
    @Override
    public Developer createDeveloper() {
        return new DotNetDeveloper();
    }
}
