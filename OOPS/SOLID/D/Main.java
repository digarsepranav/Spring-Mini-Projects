package SOLID.D;

public class Main {
    static void main(String[] args) {
        NotificationService email = new EmailNotification();
        NotificationManager manager = new NotificationManager(email);
        manager.notifyUser("Order placed");
    }
}
