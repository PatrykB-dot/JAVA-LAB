package pl.lublin.wsei.java.cwiczenia;

import java.io.UnsupportedEncodingException;
import java.lang.annotation.Native;
import java.util.Scanner;


import static java.lang.Integer.toHexString;
import static java.lang.Integer.toBinaryString;
import static java.lang.String.*;

public class Main {
    public String leftPad(String aText, char aChar, int aWidth) {
        String res = aText;
        for (int i = 0; i< aWidth - aText.length(); i++)
            res = aChar +res;
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1=0;
        do {
            System.out.print("Podaj liczbe ");
            num1 = input.nextInt();
            if (num1 == 0) break;
            String hex = Integer.toHexString(num1);
            String bin = Integer.toBinaryString(num1);
            System.out.println("Hex string is " + leftPad(hex, "%", );
            System.out.println("Bin string is " + bin);
        } while (true);
    }
}
