package fr.hb.dl.travel.business;

public class Aeroport {

    private long id;
    private String nom;

    public Aeroport(){

    }

    public Aeroport(String nom){
        this();
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Aeroport{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
