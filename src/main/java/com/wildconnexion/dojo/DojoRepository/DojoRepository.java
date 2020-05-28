package com.wildconnexion.dojo.DojoRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wildconnexion.dojo.Dojo.Dojo;



 

public class DojoRepository {

    private final static String DB_URL = "jdbc:mysql://dev-0320-db.javarover.wilders.dev:3307/bordeaux?serverTimezone=GMT";
    private final static String DB_USER = "root";
    private final static String DB_PASSWORD = "as54S4QQzs5s5";

    public List<Dojo> findAll() {

        try {
            Connection connection = DriverManager.getConnection(
                DB_URL, DB_USER, DB_PASSWORD);

            PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM dojo;"
            );
            ResultSet resultSet = statement.executeQuery();
            
            List <Dojo> dojos = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                dojos.add(new Dojo(id, name));
            }
            return dojos;
        } catch (
            SQLException e) {
                e.printStackTrace();
            }
            return null;
        }
    }