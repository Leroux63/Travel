package fr.hb.dl.travel.dao;

import fr.hb.dl.travel.business.Compagnie;

import java.sql.SQLException;
import java.util.List;

public interface CompagnieDao {
    //Create
    Compagnie ajouterCompagnie(Compagnie compagnie) throws SQLException;
    //Read
    Compagnie recupererCompagnieParId(long id) throws SQLException;
    //toutes les compagnies
    List<Compagnie> recupererToutesLesCompagnies();
    //Update
    Compagnie modifierNomCompagnie(Compagnie compagnie);
    //Delete
    boolean supprimerCompagnie(long id) throws SQLException;
}
