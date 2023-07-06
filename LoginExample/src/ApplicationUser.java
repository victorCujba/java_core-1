public interface ApplicationUser {

    User login(String username, String password);
    User createUser(String username, String password, Role role);

}
