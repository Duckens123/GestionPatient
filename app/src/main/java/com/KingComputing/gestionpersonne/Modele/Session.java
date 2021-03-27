package com.KingComputing.gestionpersonne.Modele;

import com.KingComputing.gestionpersonne.ListePatient;

import java.util.ArrayList;
import java.util.List;

public class Session {
public static Patient currentPatient;
public static List<Patient> listePatient=new ArrayList<>();

    public static Patient getCurrentPatient() {
        return currentPatient;
    }

    public static void setCurrentPatient(Patient currentPatient) {
        Session.currentPatient = currentPatient;
    }

    public static List<Patient> getListePatient() {
        return listePatient;
    }

    public static void setListePatient(List<Patient> listePatient) {
        Session.listePatient = listePatient;
    }
}
