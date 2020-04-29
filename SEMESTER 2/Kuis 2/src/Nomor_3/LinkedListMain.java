package Nomor_3;

import java.util.Scanner;

public class LinkedListMain {
    static Scanner angka = new Scanner(System.in);
    static LinkedList data = new LinkedList();
    static int nilai, index, pilMenu;

    public static void main(String[] args) {
        String bio = "NIM\t: 1941720013\nNama\t: Mochammad Syaifuddin Zuhri\nKelas\t: TI-1E";
        System.out.println("\n*--------------------------------------*");
        System.out.println(bio);
        System.out.println("*--------------------------------------*\n");
        System.out.println("\t  ***** KUIS 2 *****");
        System.out.println("*--------------------------------------*");
        System.out.println(" Program Membalikkan Data (LinkedLists)\n");

        do {
            menu();
            pilMenu = angka.nextInt();
            action(pilMenu);
        } while (pilMenu == 1 || pilMenu == 2 || pilMenu == 3);
    }
    
    public static void menu() {
        String menu = "1. Add \n2. Print \n3. Exit";
        System.out.println("\n---------------------------------");
        System.out.println("      PILIHAN MENU OPERASI");
        System.out.println("---------------------------------\n" + menu);
        System.out.print("\nMasukkan pilihan\t: ");
    }
    
    public static void action(int pilMenu) {
        switch (pilMenu) {
            case 1:
                System.out.print("\nMasukkan nilai\t: ");
                nilai = angka.nextInt();
                data.addLast(nilai);
                break;
            case 2:
                System.out.println("\n        ~ Data Linked List ~");
                System.out.println("        --------------------");
                data.print();
                data.reverseLinkedLists();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                break;
        }
    }
}