package exo1;

public class EnvoiSms implements EnvoiService{

    public void envoi(Contact contact, String message) {
        //Envoi SMS
        System.out.println("Message :" + message + "envoyé a" + contact.toString());
    }
}
