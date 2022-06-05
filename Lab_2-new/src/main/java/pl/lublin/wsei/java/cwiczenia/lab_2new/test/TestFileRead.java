package pl.lublin.wsei.java.cwiczenia.lab_2new.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestFileRead {

    public static void main(String[] args) throws IOException {
        try {
            String contents = new String(Files.readAllBytes(Paths.get("gusInfoGraphic.xml")));
            System.out.println("Zawartość pliku gusInfo...");
            System.out.println((contents));
        } catch (IOException e) {
            System.out.print("Błąd wczytywania pliku gusInfo... " + e.getLocalizedMessage());
            e.printStackTrace();
        }

    }

}
