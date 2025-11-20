package com.polytech.tp;

public class Etudiant implements Observer {
    private String nom;
    private String lastMessage = "";

    public Etudiant(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        lastMessage = message;
        System.out.println("Notification pour l'étudiant " + nom + " : " + message);
    }

    public String getLastMessage() {
        return lastMessage;
    }
}
