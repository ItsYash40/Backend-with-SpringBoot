import loose.NotificationService;
import loose.UserService;
import loose.EmailNotificationService;

public class AppMain {
    public static void main(String[] args) {

        // Tight Coupling
//        UserService us= new UserService();
//        us.notifyUser("Order Placed !");

        // Loose Coupling
        NotificationService email = new EmailNotificationService();
        UserService use = new UserService(email);

        use.notifyUser("Order Proceed!! ");
    }
}
