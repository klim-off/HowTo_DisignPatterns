package creatinalPattern.factory.factor_y;

import creatinalPattern.factory.developers.Developer;

public abstract class ProgrammingCourse {

    public abstract Developer createDeveloper();

    public  void educateStudent(){
        Developer developer = createDeveloper();
        developer.study();
    }

}
