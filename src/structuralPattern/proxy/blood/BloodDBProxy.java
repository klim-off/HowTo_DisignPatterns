package structuralPattern.proxy.blood;

import structuralPattern.proxy.security.SecuritySystem;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BloodDBProxy implements DB{
    private final SecuritySystem security;
    private BloodDB db;
    private final BloodSample denied = new BloodSample(0, "access", "denied", null, null, null);

    public BloodDBProxy() {
        this.security = new SecuritySystem();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        security.authorize(login, password);
        if (security.isAuthorized()) {
            db = new BloodDB();
        }

    }

    @Override
    public BloodSample getById(int id) {
        if (security.isAuthorized()) { return db.getById(id);}
        else {return denied;}
    }

    @Override
    public List<BloodSample> find(String request) {
        if (security.isAuthorized()) { return db.find(request);}
        /*else {
            List<BloodSample> sampleList  = new ArrayList<>();
            sampleList.add(denied);
            return sampleList;}*/
        else { return Collections.singletonList(denied);}
    }
}
