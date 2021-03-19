package sn.isi.traitement;

import sn.is.entitties.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Scanner;

public  class MedecinImp implements IMedecin{
    @Override
    public Medcine saisie() {
        Scanner scan = new Scanner(System.in);
        Medcine m = null;
        System.out.print(": ---------1  saisi medcin specialiste------");
        System.out.print("-----------2  saisi medcin generaliste------- :");
        System.out.print("-----------3  saisi medecin chef    ---------- :");
        System.out.print(" ----------------------------------------:");

      int menuAccueil  = Integer.parseInt(scan.nextLine());

        switch (menuAccueil)
        {
            case 1:

                m =new MedecinSpecialiste();
                saisiMedecin(scan, m);
                System.out.print("entrer le specialite du medcin");
                ((MedecinSpecialiste)m).setSpecialite(scan.nextLine());
                break;

            case 2 :

                m =new MedecinGeneraliste();
                saisiMedecin(scan, m);
                System.out.print("entrer les specialiste du medcin");
                ((MedecinGeneraliste)m).setListeSpecialiste(scan.nextLine());
                break;

            case 3 :

                m =new MedecinChef() ;
                saisiMedecin(scan, m);
                System.out.print("entrer le bureau du medcin");
                ((MedecinChef)m).setBureau(scan.nextLine());
                break;

        }


        return m;
    }

    private void saisiMedecin(Scanner scan, Medcine m) {
        System.out.println("entrer les informations du medecin");
        System.out.print("entrer l'identifiant de medcin");
        m.setId(Integer.parseInt(scan.nextLine()));
        System.out.print("entrer le nom de du medcin");
        m.setNom(scan.nextLine());
        System.out.print("entrer prenom de medcin");
        m.setPrenom(scan.nextLine());
        Services service = new Services ();
        System.out.print("entrer l' id du service  du medcin");
        service.setId(Integer.parseInt(scan.nextLine()));
        System.out.print("entrer le nom de service du medcin");
        m.setServices(service);
    }



    @Override
    public void affiche(Medcine m) {


        System.out.println(" les informatons du medcins sont");
        System.out.println(" l' identifiant du medcin est  :" +m.getId() );
        System.out.println(" le nom du medcin est  :" +m.getNom() );
        System.out.println(" le prenom du medcin est  :" +m.getPrenom() );
        System.out.println(" le prenom du medcin est  :" +m.getServices().getId() );
        System.out.println(" le prenom du medcin est  :" +m.getServices().getNom() );

        if (m instanceof MedecinGeneraliste){
            System.out.println(" le prenom du medcin est  :" +((MedecinGeneraliste)m).getListeSpecialiste());
        }
        if (m instanceof MedecinSpecialiste){
            System.out.println(" le prenom du medcin est  :" +((MedecinSpecialiste)m).getSpecialite());
        }
        if (m instanceof MedecinChef){
            System.out.println(" le prenom du medcin est  :" +((MedecinChef)m).getBureau());
        }


    }
}
