package ch.heigvd.poo.personne;
import ch.heigvd.poo.Lecon;

public class Professeur extends Personne {
    private String abreviation;
    private Lecon[] lecons;

    public Professeur(String nom, String prenom, String abreviation, Lecon... lecons) {
        super(nom, prenom);
        this.abreviation = abreviation;
        this.lecons = lecons;
    }

    public void setLecons(Lecon... lecons) {
        this.lecons = lecons;
    }

    public String abreviation() {
        return abreviation;
    }

    @Override
    public String toString() {
        return "Prof. " + super.toString() + " (" + abreviation + ")";
    }

    public String horaire(){
        return Lecon.horaire(lecons);
    }
}
