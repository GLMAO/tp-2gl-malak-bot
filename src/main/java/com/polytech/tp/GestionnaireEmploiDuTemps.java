package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<ICours> listeCours = new ArrayList<>();

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
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void ajouterCours(ICours cours) {
        listeCours.add(cours);
        notifyObservers("Nouveau cours ajouté : " + cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        notifyObservers("Cours modifié : " + message);
    }

    public void setChangement(String message) {
        notifyObservers(message);
    }
}
