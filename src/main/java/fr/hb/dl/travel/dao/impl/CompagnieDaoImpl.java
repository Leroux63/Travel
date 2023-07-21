package fr.hb.dl.travel.dao.impl;

import fr.hb.dl.travel.business.Compagnie;
import fr.hb.dl.travel.dao.CompagnieDao;
import fr.hb.dl.travel.dao.ConnexionBdd;
import fr.hb.dl.travel.dao.Requetes;

import java.sql.*;
import java.util.List;

public class CompagnieDaoImpl implements CompagnieDao {

    //ici on ramène la connection de la class java connection
    private Connection connection;

    public CompagnieDaoImpl() {
        try {
            connection = ConnexionBdd.getConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // Autres actions à effectuer en cas d'erreur de classe non trouvée...
        } catch (SQLException e) {
            e.printStackTrace();
            // Autres actions à effectuer en cas d'erreur SQL...
        }

    }

    @Override
    public Compagnie ajouterCompagnie(Compagnie compagnie) throws SQLException {
        //On prépare la requete que l'on va envoyer
        PreparedStatement ps = connection.prepareStatement(Requetes.AJOUT_COMPAGNIE, Statement.RETURN_GENERATED_KEYS);
        //on remplace les points d'intérogation
        ps.setString(1, compagnie.getNom());
        //on fait executeUpdate lors des requetes INSERT / UPDATE / DELETE
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        //ici le rs.next voit s'il a généré une clé , il renvoie un booléan true ou false.
        if (rs.next()){
            compagnie.setId(rs.getLong(1));
        }
        return compagnie;
    }

    public Compagnie recupererCompagnieParId(long id) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(Requetes.COMPAGNIE_PAR_ID);
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            Compagnie compagnie = new Compagnie();
            compagnie.setId((rs.getLong("id")));
            compagnie.setNom(rs.getString("nom"));
            return compagnie;
        }
        return null;
    }
    @Override
    public List<Compagnie> recupererToutesLesCompagnies() {
        return null;
    }

    @Override
    public Compagnie modifierNomCompagnie(Compagnie compagnie) {
        return null;
    }

    @Override
    public boolean supprimerCompagnie(long id) throws SQLException {

        PreparedStatement ps = connection.prepareStatement(Requetes.SUPPRESSION_COMPAGNIE);

        return false;
    }
}
