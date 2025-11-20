package com.polytech.tp;

public class Responsable implements Observer {
    private String nom;
    private String lastMessage = "";

    public Responsable(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        lastMessage = message;
        System.out.println("Notification pour le responsable " + nom + " : " + message);
    }

    public String getLastMessage() {
        return lastMessage;
    }
}
