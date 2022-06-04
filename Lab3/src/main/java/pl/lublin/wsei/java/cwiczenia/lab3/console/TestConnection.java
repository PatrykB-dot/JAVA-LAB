package pl.lublin.wsei.java.cwiczenia.lab3.console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Properties;

public class TestConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String serverName = "localhost";
        String database = "mydb";
        Number portNumber = 3306;
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "D0ntF0rg3t");
        connectionProps.put("serverTimezone", "Europe/Warsaw");


        conn = DriverManager.getConnection(
                "jdbc:mysql://" + serverName + ":" + portNumber + "/" + database, connectionProps);

        System.out.println("Connected to database");
    }
}
