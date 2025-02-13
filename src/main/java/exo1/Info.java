package exo1;

public class Info {

    public String getInfoContact(Contact contact, InfoService infoType){
        return infoType.getInfoContact(contact);
    }
}