package sn.is.entitties;

public class Services {
    private Integer id;
    private  String nom;

    //constructeur


    public Services(Integer id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Services(){
        super();
    }

    //getteers and setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
