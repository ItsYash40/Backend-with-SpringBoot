package TightCoupling;

import TightCoupling.NotificationService;

public class UserService {
//    public void send(String message){
        NotificationService ns= new NotificationService();

        public void notifyUser(String message){
            ns.send("Notification hello");
        }

    }

//}
