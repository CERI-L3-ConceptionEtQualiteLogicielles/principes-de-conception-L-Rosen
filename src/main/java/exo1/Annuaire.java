package exo1;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Annuaire implements ContactService {
    private List<Contact> contacts = new ArrayList<>();

    public void afficheContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }

    public void ajouteContact(Contact contact) {
        contacts.add(contact);
    }

    public void supprimeContact(Contact contact) {
        contacts.remove(contact);
    }
}
