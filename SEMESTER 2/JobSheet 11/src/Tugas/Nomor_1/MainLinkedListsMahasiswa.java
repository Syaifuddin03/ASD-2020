package Tugas.Nomor_1;

import java.util.*;

public class MainLinkedListsMahasiswa {
    static Scanner angka = new Scanner(System.in);
    static Scanner huruf = new Scanner(System.in);
    static LinkedListsMahasiswa data = new LinkedListsMahasiswa();
    static int index, pilMenu, inputNim;
    static String inputNama, inputAlamat;
    static boolean stop = false;
    
    public static void main(String[] args) {
        System.out.println("\n   *** PROGRAM LINKED LISTS ***");
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

    public static void inputData(){
        System.out.print("\nMasukkan NIM\t: ");
        inputNim = angka.nextInt();
        System.out.print("Masukkan Nama\t: ");
        inputNama = huruf.nextLine();
        System.out.print("Masukkan Alamat\t: ");
        inputAlamat = huruf.nextLine();
    }

    public static int inputNim(){
        int inNim;
        System.out.print("\nMasukkan NIM\t: ");
        inNim = angka.nextInt();
        return inNim;
    }

    public static int inputIndex(){
        int inIndex;
        System.out.print("\nMasukkan index\t: ");
        inIndex = angka.nextInt();
        return inIndex;
    }

    public static void inputSalah(){
        System.out.println("\n*-------------------------------*");
        System.out.println("|     Pilihan tidak tersedia    |");
        System.out.println("*-------------------------------*");
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
            System.out.println("\n       ~ Data Linked List ~");
            System.out.println("       --------------------");
            System.out.println("*-------*----------*------------*");
            System.out.printf("| %-5s | %-8s | %-10s |\n", "NIM", "Nama", "Alamat");
            System.out.println("*-------*----------*------------*");
            data.print();
        } else if (pilMenu == 5){
            data.pesanExit();
            System.exit(0);
        } else {
            inputSalah();
        }
    }

    public static void menuAdd (int jwb){
        switch (jwb) {
            case 1:
                inputData();
                data.addFirst(inputNim, inputNama, inputAlamat);
                break;
            case 2:
                index = inputIndex();
                if ((index > data.size) || (index < 0)) {
                    System.out.println("*-------------------------------*");
                    System.out.println("|    Nilai Index diluar batas   |");
                    System.out.println("*-------------------------------*");
                    stop = true;                  
                } else stop = false;
                if(stop == false){
                    try {
                        inputData();
                        data.add(inputNim, inputNama, inputAlamat, index);             
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
            case 3:
                System.out.print("\nMasukkan NIM yang dicari : "); int cari = angka.nextInt();
                try {
                    data.getKey(cari);                    
                } catch (Exception e) {}
                inputData();
                try {
                    data.addByValue(inputNim, inputNama, inputAlamat, cari);
                } catch (Exception e) {
                    System.out.println("*-------------------------------*");
                    System.out.println("|    Data gagal ditambahkan    |");
                    System.out.println("*-------------------------------*");
                }
                break;
            case 4:
                inputData();
                data.addLast(inputNim, inputNama, inputAlamat);
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
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                try {
                    data.removeByValue(inputNim());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }         
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
                    data.get(index);     
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                try {
                    data.getKey(inputNim());      
                } catch (Exception e) {}
                break;
            default:
                inputSalah();
                break;
        }
    }
}