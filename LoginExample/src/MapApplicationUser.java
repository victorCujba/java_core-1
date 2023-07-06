import java.util.HashMap;
import java.util.Map;

public class MapApplicationUser implements ApplicationUser {

    private final Map<String, User> userDatabase;
    private User authenticatedUser;

    public MapApplicationUser(String username, String password) {
        this.userDatabase = new HashMap<>();
        this.userDatabase.put(username, new User(username, password, Role.ADMIN));
    }

    @Override
    public void login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            User user = userDatabase.get(username);
            if (user.getPassword().equals(password)) {
                System.out.printf("Benvenuto %s\n", user);
                this.authenticatedUser = user;
                return;
            }
        }
        System.out.println("la password o l'username dell'utente non é valida");
    }

    @Override
    public User createUser(String username, String password, Role role) {
        if (authenticatedUser.getRole().equals(Role.ADMIN)) {
            User user = new User(username, password, role);
            System.out.printf("L'utente %s é stato creato con successo da %s\n", user, authenticatedUser.getUsername());
            return userDatabase.put(username, user);
        } else {
            System.out.println("L'utente attualmente autenticato non ha i permessi necessari per creare un altro utente");
            return null;
        }
    }

    @Override
    public User getAuthenticatedUser() {
        return this.authenticatedUser;
    }
}
