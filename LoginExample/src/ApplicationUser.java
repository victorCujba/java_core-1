import pojo.Role;
import pojo.User;

public interface ApplicationUser {

    void login(String username, String password);
    User createUser(String username, String password, Role role) throws Exception;
    User getAuthenticatedUser();

}
