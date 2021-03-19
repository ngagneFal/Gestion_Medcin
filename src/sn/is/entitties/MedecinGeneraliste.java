package sn.is.entitties;

public class MedecinGeneraliste extends Medcine {
    private String listeSpecialiste;
    // constructions

    public MedecinGeneraliste(Integer id, String prenom, String nom, Services services, String listeSpecialiste) {
        super(id, prenom, nom, services);
        this.listeSpecialiste = listeSpecialiste;
    }

    public MedecinGeneraliste(){

        super();
    }
    //getters and setters


    public String getListeSpecialiste() {
        return listeSpecialiste;
    }

    public void setListeSpecialiste(String listeSpecialiste) {
        this.listeSpecialiste = listeSpecialiste;
    }


}
