package Tugas;

import java.util.Scanner;

/**
 * PrefixMain
 */
public class PrefixMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("    *** Konversi To Prefix *** ");
        System.out.println("=============================================\n");
        System.out.print("Masukkan ekspresi matematika\t: ");
        String eks = input.next();
        Prefix prefix = new Prefix(eks);
        prefix.konversi(eks);
        System.out.println();
        prefix.print();
        System.out.println("\n=============================================\n");
    }
}