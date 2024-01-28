package behavioralPattern.chainOfResponsibility;

import behavioralPattern.chainOfResponsibility.support.*;

public class CRM {

    private TechSupport techSupport;

    public CRM() {
        this.techSupport = new CallCenter();
        techSupport.setNextLevel(new HelpDesk())
                .setNextLevel(new SysAdmin())
                .setNextLevel(new ITDirector());
        }



    public void register(String problem) {
        System.out.println(problem);
        techSupport.solve(problem.trim().toLowerCase());
    }
}


