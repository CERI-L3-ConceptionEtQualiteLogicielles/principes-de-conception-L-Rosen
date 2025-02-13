package exo1;

/*
Methode 1
public class EnvoiPhoto extends ServiceEnvoiPhoto implements EnvoiService{

    public void envoi(Contact contact, String message) {
        envoiPhoto(contact,message);
    }
}
*/

//Methode 2
public class EnvoiPhoto implements EnvoiService{
    public ServiceEnvoiPhoto service = new ServiceEnvoiPhoto();

    public void envoi(Contact contact, String message) {
        service.envoiPhoto(contact,message);
    }
}
