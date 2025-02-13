package exo1;

public class Contact {
    private String nom;
    private String numero;

    private Info info = new Info();

    public Contact(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public String getInfoContact(InfoService format) {
        return info.getInfoContact(this,format);
    }

    @Override
    public String toString() {
        return "Nom: " + getNom() + ", Numéro: " + getNumero(); //DRY
    }
}

