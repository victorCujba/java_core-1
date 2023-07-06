public interface ApplicationUser {

    void login(String username, String password);
    User createUser(String username, String password, Role role);
    User getAuthenticatedUser();

}
