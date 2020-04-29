package Tugas;

import java.util.Scanner;

public class QueueTugasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, pilih, inputPos, inputData;
        System.out.print("Masukkan jumlah maksimal antrian : "); n = sc.nextInt();  
        QueueTugas Q = new QueueTugas(n);
        do {
            menu();
            System.out.print("Masukkan Pilihan : "); pilih = sc.nextInt();
            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) System.out.println("Data yang dikeluarkan : " + dataKeluar);
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
                    System.out.print("Masukkan data antrian : "); inputData = sc.nextInt();
                    Q.peekPosition(inputData);
                    break;
                case 7:
                    System.out.print("Masukkan posisi antrian : "); inputPos = sc.nextInt();
                    Q.peekAt(inputPos);
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