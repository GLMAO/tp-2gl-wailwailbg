package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        String msg = "Nouveau cours ajouté : " + cours.getDescription();
        System.out.println(msg);
        notifyObservers(msg);
    }

    public void modifierCours(ICours cours, String message) {
        System.out.println("Cours modifié : " + message);
        notifyObservers("Cours modifié : " + message);
    }

    // Méthode utilisée dans certains tests (ne pas supprimer !)
    public void setChangement(String message) {
        notifyObservers(message);
    }
}