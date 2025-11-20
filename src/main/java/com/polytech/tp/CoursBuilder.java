package com.polytech.tp;

public class CoursBuilder {
    private String matiere;
    private String enseignant = "Inconnu";
    private String salle = "À distance";
    private String date = "01/01/2025";
    private String heureDebut = "08:00";
    private boolean estOptionnel = false;
    private String niveau = "L3";
    private boolean necessiteProjecteur = false;

    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }

    public CoursBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public CoursBuilder setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
        return this;
    }

    public CoursBuilder setOptionnel(boolean estOptionnel) {
        this.estOptionnel = estOptionnel;
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        this.niveau = niveau;
        return this;
    }

    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) {
        this.necessiteProjecteur = necessiteProjecteur;
        return this;
    }

    public Cours build() {
        return new Cours(matiere, enseignant, salle, date, heureDebut,
                estOptionnel, niveau, necessiteProjecteur);
    }
}