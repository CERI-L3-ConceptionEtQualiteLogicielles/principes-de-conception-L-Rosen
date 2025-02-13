package exo1;

public class Envoi{

    public void envoi(Contact contact, String message, EnvoiService service) {
        service.envoi(contact,message);
    }
}
