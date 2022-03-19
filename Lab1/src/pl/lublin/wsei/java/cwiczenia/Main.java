package pl.lublin.wsei.java.cwiczenia;

import java.io.UnsupportedEncodingException;
import java.lang.annotation.Native;
import java.util.Scanner;


import static java.lang.Integer.toHexString;
import static java.lang.Integer.toBinaryString;
import static java.lang.String.*;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner input = new Scanner(System.in);
        int num1=0,bin_num=0, hex_num=0;
        do {
            System.out.print("Podaj liczbe ");
            num1 = input.nextInt();
            if (num1 == 0) break;

            System.out.println("Hex string is " + Integer.toHexString(num1));
            System.out.println("Bin string is " + Integer.toBinaryString(num1));
        } while (true);
    }
}
