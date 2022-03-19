package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.io.UnsupportedEncodingException;
import java.lang.annotation.Native;
import java.util.Scanner;


import static java.lang.Integer.toHexString;
import static java.lang.Integer.toBinaryString;
import static java.lang.String.*;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        System.out.println(acc.translit("Патрик Борица"));
    }
}
