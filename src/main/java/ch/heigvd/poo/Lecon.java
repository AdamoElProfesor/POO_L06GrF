package ch.heigvd.poo;

import ch.heigvd.poo.personne.Professeur;

public class Lecon {
    private String matiere;
    private int jourSemaine;
    private int periodeDebut;
    private int duree;
    private String salle;
    private Professeur professeur = null;

    public Lecon(String matiere, int jourSemaine, int periodeDebut, int duree, String salle) {
        this.matiere = matiere;
        this.jourSemaine = jourSemaine;
        this.periodeDebut = periodeDebut;
        this.duree = duree;
        this.salle = salle;
    }

    public Lecon(String matiere, int jourSemaine, int periodeDebut, int duree, String salle, Professeur professeur) {
        this(matiere, jourSemaine, periodeDebut, duree, salle);
        this.professeur = professeur;
    }

    public String horaire(/*args:*/){
        return "";
    }
}
