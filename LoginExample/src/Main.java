

/*
    PARTE 1:
    modellare 3 tipi di utenti:
        - admin
        - editor
        - user
    Un utente incapsula gli attributi "username" e "password"

    questi utenti sono inseriti all'interno di un database rappresentato dalla classe ApplicationUsers;
    il database va rappresentato da una struttura dati adeguata (List, Set, Map)
    La classe ApplicationUsers mi permette di verificare se la coppia <username, password> esiste ed é corretta.
    Se esiste allora ritorno il corrispondente utente.
    La classe ApplicationUsers mi permette di creare un utente dati uno username, password e ruolo.

    PARTE 2:
    autorizzare la creazione dell'utente solo per gli utenti ADMIN
    cifrare la password

    PARTE 3:
    creare una classe surveyManager che tenga traccia dei questionari creati.
    Solo l'EDITOR e l'ADMIN possono creare un questionario
    Tutti i tipi di utenti possono ottenere/leggere i questionari

    Survey:
        owner
        text

 */
public class Main {
    public static void main(String[] args) {
        ApplicationUser applicationUser = new MapApplicationUser("davide", "12345");

        applicationUser.login("davide", "12345");
        User userWhoNotExists = new User("non-esiste", " ", Role.ADMIN);
        applicationUser.createUser("gigibau", "abcde", Role.USER);
    }
}