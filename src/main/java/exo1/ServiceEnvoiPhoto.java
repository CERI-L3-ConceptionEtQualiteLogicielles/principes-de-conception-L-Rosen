package exo1;

public class ServiceEnvoiPhoto {

    public void envoiPhoto(Contact c,String image){
        System.out.println("Image : " + image + " envoyé a " + c.toString());
    }
}
