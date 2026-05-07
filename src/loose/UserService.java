package loose;

public class UserService {
    private final NotificationService ns; // Define the dependency

    // Constructor
    public UserService(NotificationService ns) {
        this.ns = ns;
    }

    public void notifyUser(String message) {
        ns.send(message);
    }
}