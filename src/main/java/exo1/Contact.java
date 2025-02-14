package exo1;

public class Contact {
    private String nom;
    private String numero;

    private String prenom;
    private String civilite;


    private Contact() {
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public String getPrenom(){
        return  prenom;
    }

    public String getCivilite() {
        return civilite;
    }

    public String getInfoContact(InfoService format) {
        return format.getInfoContact(this);
    }

    @Override
    public String toString() {
        return "Nom: " + getNom() + ", Prénom: " + getPrenom()  + ", Numéro: " + getNumero() + ", Civilité: " +getCivilite(); //DRY
    }

    public static  class ContactBuilder{
        private String nom;
        private String numero;

        private String prenom;
        private String civilite;

        public ContactBuilder(String nom, String numero){
            this.nom = nom;
            this.numero = numero;
        }

        public void addPrenom(String prenom){
            this.prenom = prenom;
        }

        public void addCivilite(String civilite){
            this.civilite = civilite;
        }

        public Contact build(){
            Contact contact = new Contact();
            contact.nom = this.nom;
            contact.numero = this.numero;
            contact.prenom = this.prenom;
            contact.civilite = this.civilite;

            return  contact;
        }
    }
}

