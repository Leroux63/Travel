package fr.hb.dl.travel.dao.impl;

import fr.hb.dl.travel.dao.AeroportDao;
import fr.hb.dl.travel.dao.ConnexionBdd;

import java.sql.Connection;
import java.sql.SQLException;

public class AeroportDaoImpl implements AeroportDao {

    //ici on ramène la connection de la class java connection
    private Connection connection;

    public AeroportDaoImpl() {
        try{
            connection = ConnexionBdd.getConnection();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
