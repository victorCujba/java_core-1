package exceptions;

import pojo.User;

public class NotAuthorizedException extends Exception {

    public NotAuthorizedException(User user, String operationType) {
        super(String.format("L'utente con username %s che é attualmente autenticato non ha i permessi necessari per effettuare %s", user.getUsername(), operationType));
    }

}
