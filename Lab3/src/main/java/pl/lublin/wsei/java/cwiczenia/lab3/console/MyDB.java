package pl.lublin.wsei.java.cwiczenia.lab3.console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDB {

    private Number portNumber ;
    private String serverName ;
    private String database ;
    private Connection conn = null;
    private String user;
    private String password;

    public MyDB() {
        portNumber = 3306;
        serverName = "localhost";
        database = "mydb";
        user = "root";
        password = "D0ntF0rg3t";
    }

    private void connect() {
        Properties connectionProps = new Properties();
        connectionProps.put("user", user);
        connectionProps.put("password", password);
        connectionProps.put("serverTimezone", "Europe/Warsaw");

        String jdbcString = "jdbc:mysql://" + serverName + ":" + portNumber + "/" + database;
        try {
            conn = DriverManager.getConnection(jdbcString, connectionProps);
        }
        catch (SQLException e) {
            System.out.println("Błąd podłączenia do bazy: "+jdbcString);
            System.out.println("Komunikat błędu: "+e.getMessage());
            conn = null;
        }
        System.out.println("Connected to database "+database);
    }
    public Connection getConnection() {
        if (conn == null)
            connect();
        return conn;
    }
}
