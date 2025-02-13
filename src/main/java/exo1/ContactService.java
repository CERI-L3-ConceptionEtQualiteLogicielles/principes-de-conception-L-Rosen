package exo1;

public interface ContactService {
    void ajouteContact(Contact contact);
    void supprimeContact(Contact contact);
    void afficheContacts();
    //void envoiEmail(Contact contact, String message); Interface segregation
}