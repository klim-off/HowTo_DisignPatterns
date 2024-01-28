package creatinalPattern.abstractFactory.factories;

import creatinalPattern.abstractFactory.juniors.JuniorDeveloper;
import creatinalPattern.abstractFactory.juniors.PythonJunior;
import creatinalPattern.abstractFactory.middles.MiddleDeveloper;
import creatinalPattern.abstractFactory.middles.PythonMiddle;
import creatinalPattern.abstractFactory.seniors.PythonSenior;
import creatinalPattern.abstractFactory.seniors.SeniorDeveloper;

public class PythonCourse implements DeveloperCourse{
    @Override
    public JuniorDeveloper createJunior() {

        return new PythonJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {

        return new PythonMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {

        return new PythonSenior();
    }
}
