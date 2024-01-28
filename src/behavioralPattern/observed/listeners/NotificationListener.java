package behavioralPattern.observed.listeners;

public interface NotificationListener {
    void update(NotificationType notificationType, String chain);
}
