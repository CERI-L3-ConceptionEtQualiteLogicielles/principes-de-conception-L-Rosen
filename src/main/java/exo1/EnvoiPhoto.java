package exo1;

public class EnvoiPhoto extends ServiceEnvoiPhoto implements EnvoiService{

    public void envoi(Contact contact, String message) {
        envoiPhoto(contact,message);
    }
}
