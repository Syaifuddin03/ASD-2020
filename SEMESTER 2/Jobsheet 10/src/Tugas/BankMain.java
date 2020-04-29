package Tugas;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        Scanner huruf = new Scanner(System.in);
        int n, pilih, cariPosisi;
        String noRek, nama, cariNama;

        System.out.print("\nMasukkan jumlah maksimal antrian : "); n = angka.nextInt();  
        Bank Q = new Bank(n);
        do {
            menu();
            System.out.print("Masukkan Pilihan : "); pilih = angka.nextInt();
            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nomor rekenening\t: "); noRek = huruf.nextLine();
                    System.out.print("Masukkan nama nasabah\t\t: "); nama = huruf.nextLine();   
                    Nasabah nasabah = new Nasabah(noRek, nama);
                    Q.Enqueue(nasabah);
                    break;
                case 2:
                    Q.Dequeue();
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama nasabah : "); cariNama = huruf.nextLine();
                    Q.peekPosition(cariNama);
                    break;
                case 7:
                    System.out.print("Masukkan posisi antrian : "); cariPosisi = angka.nextInt();
                    Q.peekAt(cariPosisi);
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }

    public static void menu(){
        System.out.println("\nPilih Operasi : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("----------------------------------");
    }
}