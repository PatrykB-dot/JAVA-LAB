package pl.lublin.wsei.java.cwiczenia.lab3.console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDB {
    private String user;
    private String password;
    private String serverName;
    private Number portNumber;
    private String database;
    private Connection conn = null;

    public MyDB(String host, Number port, String dbName ){
        serverName = host;
        portNumber = port;
        database = dbName;
    }
    public void setUser(String userName){
        user = userName;
    }
    public void setPassword(String userPassword){
        password = userPassword;
    }
    private void connect(){
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.user);
        connectionProps.put("password", this.password);
        connectionProps.put("serverTimezone", "Europe/Warsaw");

        String jdbcString = "jdbc:mysql://" + this.serverName + ":" + this.portNumber + "/" + this.database;
        try {
            this.conn = DriverManager.getConnection(jdbcString, connectionProps);
        }
        catch (SQLException e) {
            System.out.println("Błąd podłączenia do bazy: "+jdbcString);
            System.out.println("Komunikat błędu: "+e.getMessage());
            this.conn = null;
        }
        System.out.println("Connected to database "+this.database);
    }
    public Connection getConnection() {
        if (conn == null)
            connect();
        return conn;
    }
    public static void main(String[] args) {
        MyDB mydb = new MyDB("localhost", 3306, "mydb");
        mydb.setUser("root");
        mydb.setPassword("D0ntF0rg3t");
        mydb.connect();
    }
}
