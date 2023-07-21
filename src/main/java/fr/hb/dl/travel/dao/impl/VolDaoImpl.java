package fr.hb.dl.travel.dao.impl;

import fr.hb.dl.travel.dao.ConnexionBdd;
import fr.hb.dl.travel.dao.VolDao;

import java.sql.Connection;
import java.sql.SQLException;

public class VolDaoImpl implements VolDao {

    //ici on ramène la connection de la class java connection
    private Connection connection;

    public VolDaoImpl() {
        try{
            connection = ConnexionBdd.getConnection();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
