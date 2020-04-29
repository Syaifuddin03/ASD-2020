package Nomor_1;

import java.util.Scanner;

public class StackKalimatMain {
    static Scanner huruf = new Scanner(System.in);
    public static void main(String[] args) {
        String bio = "NIM\t: 1941720013\nNama\t: Mochammad Syaifuddin Zuhri\nKelas\t: TI-1E";
        System.out.println("\n*--------------------------------------*");
        System.out.println(bio);
        System.out.println("*--------------------------------------*\n");
        System.out.println("\t  ***** KUIS 2 *****");
        System.out.println("*--------------------------------------*");
        System.out.println("   Program Membalikkan Kalimat (Stack)");
        System.out.print("\nMasukkan Kalimat : ");
        String kalimat = huruf.nextLine();
        
        StackKalimat tumpukan = new StackKalimat(20);
        tumpukan.balikKata(kalimat);
        tumpukan.print();
    }    
}