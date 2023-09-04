package com.movie.dao.implement;

import com.movie.dao.ServicesDAO;
import com.movie.entity.Corn;
import com.movie.entity.Water;
import com.mysql.cj.jdbc.DatabaseMetaData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ServicesDAOImpl implements ServicesDAO {
    private DatabaseMetaData DBConnection;

    @Override
    public List<Corn> getAllCorns() {
        List<Corn> corns = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DBConnection.getConnection();
            String sql = "SELECT * FROM corn";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Corn corn = new Corn();
                corn.setId(resultSet.getString("id"));
                corn.setType(resultSet.getString("type"));
                corn.setSize(resultSet.getString("size"));
                corn.setPrice(resultSet.getString("price"));
                corns.add(corn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return corns;
    }
    @Override
    public List<Water> getAllWaters() {
        List<Water> waters = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DBConnection.getConnection();
            String sql = "SELECT * FROM water";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Water water = new Water();
                water.setId(resultSet.getString("id"));
                water.setType(resultSet.getString("type"));
                water.setSize(resultSet.getString("size"));
                water.setPrice(resultSet.getString("price"));
                waters.add(water);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return waters;
    }
}