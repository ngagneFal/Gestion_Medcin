package com.company;

import sn.is.entitties.Medcine;
import sn.isi.traitement.IMedecin;
import sn.isi.traitement.MedecinImp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IMedecin medecin = new MedecinImp() ;
        Medcine m = medecin.saisie();
        medecin.affiche(m);
    }
}
