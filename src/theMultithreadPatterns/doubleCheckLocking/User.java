package theMultithreadPatterns.doubleCheckLocking;

public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.name = name;
        this.id = id;
    }
}