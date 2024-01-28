package creatinalPattern.abstractFactory.factories;

import creatinalPattern.abstractFactory.juniors.JavaScriptJunior;
import creatinalPattern.abstractFactory.juniors.JuniorDeveloper;
import creatinalPattern.abstractFactory.middles.JavaScriptMiddle;
import creatinalPattern.abstractFactory.middles.MiddleDeveloper;
import creatinalPattern.abstractFactory.seniors.JavaScriptSenior;
import creatinalPattern.abstractFactory.seniors.SeniorDeveloper;

public class JavaScriptCourse implements DeveloperCourse{
    @Override
    public JuniorDeveloper createJunior() {

        return new JavaScriptJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {

        return new JavaScriptMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {

        return  new JavaScriptSenior();
    }
}
