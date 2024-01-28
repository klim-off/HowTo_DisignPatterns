package behavioralPattern.mediator;

public interface Mediator {

    public void sendMessage(String msg, int userId);
    public void register(User user);
}
