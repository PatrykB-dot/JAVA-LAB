package pl.lublin.wsei.java.cwiczenia.lab3.console;

import java.sql.Connection;

public class TestMyDB {

    public static void main(String[] args){
        MyDB db = new MyDB("localhost", 3306, "mydb");
        db.setUser("root");
        db.setPassword("D0ntF0rg3t");
        Connection conn = db.getConnection();
        if (conn != null)
            System.out.println("Połączenie z bazą danych nawiązane");
    }
}
