module pl.lublin.wsei.java.cwiczenia.lab3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens pl.lublin.wsei.java.cwiczenia.lab3 to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.lab3;
}