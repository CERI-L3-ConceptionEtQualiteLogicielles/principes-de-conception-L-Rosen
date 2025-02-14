package exo1;

public class Main {

    public static void main(String[] args) {
        Envoi serviceEnvoi = new Envoi();

        //Test creation de contact / Afficahge
        Contact.ContactBuilder contactBuilder = new Contact.ContactBuilder("Doe","01");
        contactBuilder.addPrenom("John");
        contactBuilder.addCivilite("Monsieur");

        Contact johndoe = contactBuilder.build();
        String info = johndoe.getInfoContact(new InfoString());
        System.out.println(info);

        //Test Envoi
        serviceEnvoi.envoi(johndoe,"Bonjour",new EnvoiMail());
        serviceEnvoi.envoi(johndoe,"Bonjour",new EnvoiSms());
        serviceEnvoi.envoi(johndoe,"Bonjour",new EnvoiPhoto());


    }
}
