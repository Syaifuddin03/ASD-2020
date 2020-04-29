package Tugas;

import java.util.Scanner;

/**
 * MainTugas2
 */
public class MainTugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=======================================================");
        System.out.println("  *** SEARCHING WITH SEQUENTIAL SEARCH (ARRAY 2D) ***");
        int data[][] = new int[3][5];
        data[0][0] = 45;
        data[0][1] = 78;
        data[0][2] = 7;
        data[0][3] = 200;
        data[0][4] = 80;
        data[1][0] = 90;
        data[1][1] = 1;
        data[1][2] = 17;
        data[1][3] = 100;
        data[1][4] = 50;
        data[2][0] = 21;
        data[2][1] = 2;
        data[2][2] = 40;
        data[2][3] = 18;
        data[2][4] = 65;
        Tugas2 pencarian = new Tugas2(data, 3, 5);
        System.out.println("=======================================================\n");
        System.out.println("\t\t*** Data Array 2D ***\n");           
        pencarian.tampilData();
        
        System.out.print("\n\t Masukkan nilai yang akan dicari : ");
        int cari = input.nextInt();
        System.out.println("=======================================================");
        pencarian.TampilPosisiSeqSearch(data, cari);
    }
}