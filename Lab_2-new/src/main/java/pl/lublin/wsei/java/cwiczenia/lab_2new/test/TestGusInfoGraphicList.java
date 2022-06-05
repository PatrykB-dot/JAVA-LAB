package pl.lublin.wsei.java.cwiczenia.lab_2new.test;

import pl.lublin.wsei.java.cwiczenia.lab_2new.GusInfoGraphicList;
import pl.lublin.wsei.java.cwiczenia.lab_2new.Infografika;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestGusInfoGraphicList {
    public static void main(String[] args) {
            GusInfoGraphicList gusList = new GusInfoGraphicList("gusInfoGraphic.xml");
            for (Infografika ig: gusList.infografiki) ig.print();

    }
}
