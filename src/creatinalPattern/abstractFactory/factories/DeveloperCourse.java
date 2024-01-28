package creatinalPattern.abstractFactory.factories;

import creatinalPattern.abstractFactory.juniors.JuniorDeveloper;
import creatinalPattern.abstractFactory.middles.MiddleDeveloper;
import creatinalPattern.abstractFactory.seniors.SeniorDeveloper;

public interface DeveloperCourse {

    public JuniorDeveloper createJunior();
    public MiddleDeveloper createMiddle();
    public SeniorDeveloper createSenior();

}
