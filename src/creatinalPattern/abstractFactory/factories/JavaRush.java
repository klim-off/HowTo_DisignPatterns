package creatinalPattern.abstractFactory.factories;

import creatinalPattern.abstractFactory.juniors.JavaJunior;
import creatinalPattern.abstractFactory.juniors.JuniorDeveloper;
import creatinalPattern.abstractFactory.middles.JavaMiddle;
import creatinalPattern.abstractFactory.middles.MiddleDeveloper;
import creatinalPattern.abstractFactory.seniors.JavaSenior;
import creatinalPattern.abstractFactory.seniors.SeniorDeveloper;

public class JavaRush implements DeveloperCourse{
    @Override
    public JuniorDeveloper createJunior() {

        return new JavaJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {

        return new JavaMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {

        return new JavaSenior();
    }
}
