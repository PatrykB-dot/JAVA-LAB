package pl.lublin.wsei.java.cwiczenia.lab_2new.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {

    public static void main(String[] args) {
        String exItem = "<item>\n" +
                "\t\t\t<title><![CDATA[Infografika - Dzień Dziecka (1 czerwca)]]></title>\n" +
                "\t\t\t<pubDate><![CDATA[Wed, 01 Jun 2022 10:20:00 +0200]]></pubDate>\n" +
                "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-dzien-dziecka-1-czerwca,118,2.html</link>\n" +
                "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-dzien-dziecka-1-czerwca,118,2.html</guid>\n" +
                "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/118/2/1/dzien_dziecka_2022_slider_ang.png\" type=\"image/png\" width=\"1230\" height=\"690\">\n" +
                "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
                "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/118/2/1/dzien_dziecka_2022_slider_ang,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
                "\t\t\t</media:content>\n" +
                "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/118/2/1/dzien_dziecka_2022_slider_ang,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n" +
                "\t\t</item>";

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(exItem);
        if (m.find())
            System.out.print("Znaleziono tytuł: " +m.group(1));
        else
            System.out.println("Nie znaleziono tytułu ... ");
    }
}
