package ch.heigvd.poo.personne;

public class Professeur extends Personne {
    private String abreviation;

    public Professeur(String nom, String prenom, String abreviation) {
        super(nom, prenom);
        this.abreviation = abreviation;
    }

    public String abreviation() {
        return abreviation;
    }

    @Override
    public String toString() {
        return "Prof. " + super.toString() + " (" + abreviation + ")";
    }

    public String horaire(){
        return null;
    }
}
