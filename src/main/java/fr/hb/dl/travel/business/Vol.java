package fr.hb.dl.travel.business;

import java.time.LocalDateTime;

public class Vol {

    private long id;
    private LocalDateTime dateHeureArrivee;
    private LocalDateTime dateHeureDepart;
    private float prixEnEuro;

    private Aeroport aeroportDepart;
    private Aeroport aeroportArrivee;
    private Compagnie compagnie;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDateHeureArrivee() {
        return dateHeureArrivee;
    }

    public void setDateHeureArrivee(LocalDateTime dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public LocalDateTime getDateHeureDepart() {
        return dateHeureDepart;
    }

    public void setDateHeureDepart(LocalDateTime dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }

    public float getPrixEnEuro() {
        return prixEnEuro;
    }

    public void setPrixEnEuro(float prixEnEuro) {
        this.prixEnEuro = prixEnEuro;
    }

    public Aeroport getAeroportDepart() {
        return aeroportDepart;
    }

    public void setAeroportDepart(Aeroport aeroportDepart) {
        this.aeroportDepart = aeroportDepart;
    }

    public Aeroport getAeroportArrivee() {
        return aeroportArrivee;
    }

    public void setAeroportArrivee(Aeroport aeroportArrivee) {
        this.aeroportArrivee = aeroportArrivee;
    }

    public Compagnie getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(Compagnie compagnie) {
        this.compagnie = compagnie;
    }

    public Vol(){

    }

    public Vol(LocalDateTime dateHeureArrivee, LocalDateTime dateHeureDepart) {
        this();// ici c'est une surcharge du constructeur vide
        this.dateHeureArrivee = dateHeureArrivee;
        this.dateHeureDepart = dateHeureDepart;
    }
    //en dessous c'est un constructeur de surcharge de surcharge il prend le constructeur du dessus et lui rajoute un parametre
    public Vol(LocalDateTime dateHeureArrivee, LocalDateTime dateHeureDepart, float prixEnEuro) {
        this(dateHeureArrivee,dateHeureDepart);
        this.prixEnEuro = prixEnEuro;
    }

    @Override
    public String toString() {
        return "Vol{" +
                "id=" + id +
                ", dateHeureArrivee=" + dateHeureArrivee +
                ", dateHeureDepart=" + dateHeureDepart +
                ", prixEnEuro=" + prixEnEuro +
                ", aeroportDepart=" + aeroportDepart +
                ", aeroportArrivee=" + aeroportArrivee +
                ", compagnie=" + compagnie +
                '}';
    }
}
