package loose;

//import TightCoupling.NotificationService;
//import TightCoupling.UserService;

public class EmailNotificationService implements NotificationService {

    public void send(String message){
        System.out.println("Email: "+ message);
    }


}
