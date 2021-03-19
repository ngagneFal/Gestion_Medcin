package sn.is.entitties;

public  class MedecinSpecialiste extends Medcine{

    private String specialite;
    // constructeur

    public MedecinSpecialiste(){
        super();
    }

    public MedecinSpecialiste(Integer id, String prenom, String nom, Services services, String specialite) {

        super(id, prenom, nom, services);
        this.specialite = specialite;
    }

    //getters and setters


    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
