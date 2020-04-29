package UTS;

import java.util.Scanner;

/**
 * SequentialMain
 */
public class SearchMain_17 {
    static String jwb = "Y";
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("\n================ Program Mencari Data (UTS ASD 2020) ================\n");
        System.out.println("Dibuat oleh\t: Mochammad Syaifuddin Zuhri");
        System.out.println("NIM\t\t: 1941720013");

        int data[] = {1, 9, 4, 1, 7, 2, 0, 0, 1, 3};

        Search_17 pencarian = new Search_17(10);
        
        System.out.print("\nData Sebelum Sort\t: ");
        pencarian.printArray(data);
        System.out.print("\nData Sesudah Sort\t: ");
        pencarian.mergeSort(data);
        pencarian.printArray(data);

        while (jwb.equalsIgnoreCase("Y")){
            int pilih;
            cekMenu(pilih = pilihMenu(), pencarian, data);
        }

        System.out.println("\n=================== Program Selesai. Terima Kasih ==================\n");
    }

    static void cekMenu(int pilih, Search_17 pencarian, int data[]){
        switch (pilih) {
            case 1:
                sequentialSearch(pencarian, data);
                jwb = "N";
                break;
            case 2:
                System.out.println("\nMaaf, NIM saya ganjil. Lakukan pencarian dengan Sequential Search");
                break;
            default:
                System.out.println("\n\t\t\tMaaf, Inputan salah!");
                System.exit(0);
                break;
        }
    }

    static void sequentialSearch(Search_17 pencarian, int data[]){
        System.out.print("Data yang dicari\t: ");
        int cari = input.nextInt();
        int pos = pencarian.FindSeqSearch(cari, data);
        System.out.println();
        pencarian.TampilPosisiSeqSearch(cari, pos, data);
    }

    static int pilihMenu(){
        System.out.println("\nPilih metode pencarian\t: ");
        System.out.println("1. Sequential Search\n2. Binary Search");
        System.out.print("\nSaya pilih nomor\t: ");
        int pilih = input.nextInt();
        return pilih;
    }
}