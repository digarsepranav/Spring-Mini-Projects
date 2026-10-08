package SOLID.D;

public class SMSNotification implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
