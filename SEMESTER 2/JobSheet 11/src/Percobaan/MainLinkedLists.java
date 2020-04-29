package Percobaan;

import java.util.*;

public class MainLinkedLists {
    static Scanner angka = new Scanner(System.in);
    static LinkedLists data = new LinkedLists();
    static int nilai, index, pilMenu;
    public static void main(String[] args) {
        System.out.println("\n   *** PROGRAM LINKED LISTS ***");

        //Source Code Percobaan
        // try {
            // data.addFirst(7);
            // data.print();
            // data.add(8, 1);
            // data.print();
            // data.addFirst(1);
            // data.print();
            // data.remove(1);
            // data.print();
            // data.clear();
            // data.print();
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        //Source Code Pertanyaan Perocobaan
        do{
            menu();
            pilMenu = angka.nextInt();
            subMenu(pilMenu);
        } while (pilMenu == 1 || pilMenu == 2|| pilMenu == 3 || pilMenu == 4 || pilMenu > 5 || pilMenu < 1);
    }

    public static void menu(){
        String menu = "1. Add \n2. Remove \n3. Search \n4. Print \n5. Exit";
        System.out.println("\n---------------------------------");
        System.out.println("      PILIHAN MENU OPERASI");
        System.out.println("---------------------------------\n" + menu);
        System.out.print("\nMasukkan pilihan\t: ");
    }

    public static int inputSubMenu(){
        int pilSubMenu;
        System.out.print("\nMasukkan pilihan\t: ");
        pilSubMenu = angka.nextInt();
        return pilSubMenu;
    }

    public static int inputnilai(){
        int inNilai;
        System.out.print("\nMasukkan nilai\t: ");
        inNilai = angka.nextInt();
        return inNilai;
    }

    public static int inputIndex(){
        int inIndex;
        System.out.print("\nMasukkan index\t: ");
        inIndex = angka.nextInt();
        return inIndex;
    }

    public static void inputSalah(){
        System.out.println("\nPilihan tidak tersedia!");
    }

    public static void subMenu(int pilMenu){
        String menuTambah = "1. Add (First) \n2. Add (Index) \n3. Add (Value) \n4. Add (Last)";
        String menuHapus = "1. Remove (Index) \n2. Remove (Value) \n3. Clear";
        String menuCari = "1. Search (Index) \n2. Search (Value)";
        int jwb;
        if (pilMenu == 1) {
            System.out.println("\n    ~ Pilihan Menu Add ~");
            System.out.println("    --------------------");
            System.out.println(menuTambah);
            jwb = inputSubMenu();
            menuAdd(jwb);
            System.out.println();
        } else if (pilMenu == 2) {
            System.out.println("\n    ~ Pilihan Menu Remove ~");
            System.out.println("    -----------------------");
            System.out.println(menuHapus);
            jwb = inputSubMenu();
            menuRemove(jwb);
            System.out.println();
        } else if (pilMenu == 3) {
            System.out.println("\n    ~ Pilihan Menu Search ~");
            System.out.println("    -----------------------");
            System.out.println(menuCari);
            jwb = inputSubMenu();
            menuSearch(jwb);
            System.out.println();
        } else if (pilMenu == 4) {
            System.out.println("\n    ~ Data Linked List ~");
            System.out.println("    --------------------");
            data.print();
        } else if (pilMenu == 5){
            System.exit(0);
        } else {
            inputSalah();
        }
    }

    public static void menuAdd (int jwb){
        switch (jwb) {
            case 1:
                nilai = inputnilai();
                data.addFirst(nilai);
                break;
            case 2:
                nilai= inputnilai();
                index = inputIndex();
                try {
                    data.add(nilai, index);                    
                } catch (Exception e) {}
                break;
            case 3:
                System.out.print("\nMasukkan nilai yang dicari : "); int cari = angka.nextInt();
                try {
                    data.getKey(cari);                    
                } catch (Exception e) {}
                System.out.print("\nMasukkan nilai yang ditambah : "); int tambah = angka.nextInt();
                try {
                    data.addByValue(tambah, cari);
                } catch (Exception e) { }
                break;
            case 4:
                nilai = inputnilai();
                data.addLast(nilai);
                break;
            default:
                inputSalah();
                break;
        }
    }

    public static void menuRemove (int jwb){
        switch (jwb) {
            case 1:
                index = inputIndex();
                try {
                    data.remove(index);                    
                } catch (Exception e) {}
                break;
            case 2:
                nilai = inputnilai();
                try {                
                    data.removeByValue(nilai);
                } catch (Exception e) {}
                break;
            case 3:
                data.clear();
                break;
            default:
                inputSalah();
                break;
        }
    }

    public static void menuSearch (int jwb){
        switch (jwb) {
            case 1:
                index = inputIndex();
                try {
                    System.out.println("Index " + index + " berhasil ditemukan = " + data.get(index));                    
                } catch (Exception e) {}
                break;
            case 2:
                nilai = inputnilai();
                try {
                    data.getKey(nilai);                    
                } catch (Exception e) {}
                break;
            case 3:
                
                break;
            default:
                inputSalah();
                break;
        }
    }
}