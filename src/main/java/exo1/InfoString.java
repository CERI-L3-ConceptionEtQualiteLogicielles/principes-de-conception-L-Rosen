package exo1;

public class InfoString implements InfoService{

    public String getInfoContact(Contact contact) {
        return contact.toString();
    }
}
