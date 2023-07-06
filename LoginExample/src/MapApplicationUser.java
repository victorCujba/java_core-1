import java.util.HashMap;
import java.util.Map;

public class MapApplicationUser implements ApplicationUser {

    private final Map<String, User> userDatabase;

    public MapApplicationUser() {
        this.userDatabase = new HashMap<>();
    }

    @Override
    public User login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            User user = userDatabase.get(username);
            if (user.getPassword().equals(password)) {
                System.out.printf("Benvenuto %s\n", user);
                return user;
            } else {
                System.out.println("la password dell'utente inserita non esiste");
                return null;
            }
        } else {
            System.out.println("l'username dell'utente inserito non esiste");
            return null;
        }
    }

    @Override
    public User createUser(String username, String password, Role role) {
        User user = new User(username, password, role);
        return userDatabase.put(username, user);
    }
}
