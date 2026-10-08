package SOLID.D;

public class NotificationManager {
    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message) {
        notificationService.send(message);
    }
}
