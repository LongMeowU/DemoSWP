package dao;

import entity.BaseEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class DBContext<T extends BaseEntity> {
    protected Connection connection;

    DBContext() {
        try {
            String url = "jdbc:mysql://localhost:9999/login_schema";
            String user = "root";
            String password = "longdongtao2002";
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract ArrayList<T> list();
    public abstract void update(T entity);
    public abstract void delete(T entity);
    public abstract void insert(T entity);
    public abstract T get(T entity);
}
