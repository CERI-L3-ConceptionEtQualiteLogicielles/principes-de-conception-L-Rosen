package exo1;

public class EnvoiMail implements EnvoiService{

    public void envoi(Contact contact, String message) {
    //Envoi Mail
        System.out.println("Sms :" + message + "envoyé a" + contact.toString());
    }
}
