package com.KingComputing.gestionpersonne.Modele;

public class Patient {
    String id,nom,prenom,sexe,adresse,telephone,symptome;
    public Patient(String id,String nom,String prenom,String adresse,String telephone, String sexe,String symptome){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.telephone=telephone;
        this.sexe=sexe;
        this.symptome=symptome;
    }
    public Patient(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSymptome() {
        return symptome;
    }

    public void setSymptome(String symptome) {
        this.symptome = symptome;
    }

    @Override
    public String toString() {
        return this.nom+ " "+this.prenom+" "+this.sexe+" "+this.adresse+" "+this.telephone+" "+this.symptome;
    }
}
