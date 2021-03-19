package sn.is.entitties;

public class MedecinChef  extends Medcine {
    private String bureau;

    //conc=struction avc argument


    public MedecinChef(Integer id, String prenom, String nom, Services services, String bureau) {
        super(id, prenom, nom, services);
        this.bureau = bureau;
    }

    public MedecinChef(){
        super();
    }
    // getters and setters


    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }
}
