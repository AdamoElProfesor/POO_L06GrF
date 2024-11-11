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

    public static String horaire(Lecon... lecons) {
        StringBuilder sb = new StringBuilder();
        String[][] schedule = new String[9][5]; // 9 periods and 5 days (Mon-Fri)

        for (Lecon lecon : lecons) {
            int day = lecon.jourSemaine - 1;
            for (int i = 0; i < lecon.duree; i++) {
                schedule[lecon.periodeDebut + i][day] = String.format("%s %s %s",
                        lecon.matiere,
                        lecon.salle,
                        lecon.professeur != null ? lecon.professeur.abreviation() : "");
            }
        }

        String[] days = {"Lun", "Mar", "Mer", "Jeu", "Ven"};
        sb.append("     | ");
        for (String day : days) sb.append(String.format("%-11s| ", day));
        sb.append("\n");

        String[] times = {"8:30", "9:15", "10:25", "11:15", "12:00", "13:15", "14:00", "14:55", "15:45", "16:35"};
        for (int i = 0; i < schedule.length; i++) {
            sb.append(String.format("%-5s| ", times[i]));
            for (int j = 0; j < 5; j++) {
                sb.append(String.format("%-11s| ", schedule[i][j] != null ? schedule[i][j] : ""));
            }
            sb.append("\n     |-------------|-------------|-------------|-------------|-------------|\n");
        }
        return sb.toString();
    }
}
