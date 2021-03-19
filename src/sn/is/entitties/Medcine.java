package sn.is.entitties;

public abstract class Medcine extends Personne {
    private Services services;
    //construction

    public Medcine(Integer id, String prenom, String nom, Services services) {
        super(id, prenom, nom);
        this.services = services;
    }

    public Medcine(){
        super();
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }
}
