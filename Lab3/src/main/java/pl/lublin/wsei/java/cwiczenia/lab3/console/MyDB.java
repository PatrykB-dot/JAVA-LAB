package pl.lublin.wsei.java.cwiczenia.lab3.console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDB {

    Number portNumber = 3306;
    String serverName = "localhost";
    String database = "mydb";
    Connection conn = null;
    String user = "root";
    String password = "D0ntF0rg3t";
    private void connect(){
        MyDB mydb = new MyDB();
        Properties connectionProps = new Properties();
        connectionProps.put("user", mydb.user);
        connectionProps.put("password", mydb.password);
        connectionProps.put("serverTimezone", "Europe/Warsaw");

        String jdbcString = "jdbc:mysql://" + mydb.serverName + ":" + mydb.portNumber + "/" + mydb.database;
        try {
            mydb.conn = DriverManager.getConnection(jdbcString, connectionProps);
        }
        catch (SQLException e) {
            System.out.println("Błąd podłączenia do bazy: "+jdbcString);
            System.out.println("Komunikat błędu: "+e.getMessage());
            mydb.conn = null;
        }
        System.out.println("Connected to database "+mydb.database);
    }
    public Connection getConnection() {
        if (conn == null)
            connect();
        return conn;
    }
    public static void main(String[] args) {
        MyDB mydb = new MyDB();
        mydb.connect();
    }
}
