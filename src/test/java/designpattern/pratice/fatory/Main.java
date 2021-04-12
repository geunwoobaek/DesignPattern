package designpattern.pratice.fatory;

public class Main {
    public static void main(String[] args){
        Notification notification=NotificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
