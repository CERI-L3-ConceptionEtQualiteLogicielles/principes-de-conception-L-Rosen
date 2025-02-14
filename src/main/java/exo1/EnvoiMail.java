package exo1;

public class EnvoiMail implements EnvoiService{

    public void envoi(Contact contact, String message) {
    //Envoi Mail
        System.out.println("Mail : " + message + " envoyé a : " + contact.toString());
    }
}
