package pl.lublin.wsei.java.cwiczenia.lab_2new;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    String graphicTitle;
    String graphicWebsiteAddress;
    String graphicAddress;
    String thumbnailAddress;
    String graphicWidth;
    String graphicHeight;

    public Infografika(String text) {
        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher((text));
        if (m.find())
            graphicTitle = m.group(1);
        else
            graphicTitle = "";

        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher((text));
        if (m.find())
            graphicWebsiteAddress = m.group(1);
        else
            graphicWebsiteAddress = "";

        pat = Pattern.compile("<media:content url=\"(.*)\" type");
        m = pat.matcher((text));
        if (m.find())
            graphicAddress = m.group(1);
        else
            graphicAddress = "";

        pat = Pattern.compile("<media:thumbnail url=\"(.*)\"");
        m = pat.matcher((text));
        if (m.find())
            thumbnailAddress = m.group(1);
        else
            thumbnailAddress = "";

        pat = Pattern.compile("width=\"(.*)\" height");
        m = pat.matcher((text));
        if (m.find())
            graphicWidth = m.group(1);
        else
            graphicWidth = "";

        pat = Pattern.compile("height=\"(.*)\"");
        m = pat.matcher((text));
        if (m.find())
            graphicWidth = m.group(1);
        else
            graphicWidth = "";
    }
}
