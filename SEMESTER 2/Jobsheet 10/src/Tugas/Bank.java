package Tugas;

public class Bank {
    int max, front, size, rear, posisi;
    Nasabah[] Q;

    public Bank(int max) {
        this.max = max;
        Create();
    }

    public void Create(){
        Q = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if(size == 0) return true;
        else return false;
    }

    public boolean IsFull(){
        if(size == max) return true;
        else return false;
    }

    public void peek(){
        if (!IsEmpty()) {
            System.out.println("\n** Antrian paling depan **");
            System.out.println("-----------------------------------");  
            System.out.println("Nomor Rekening\t: " + Q[front].nomorRekening);
            System.out.println("Nama Nasabah\t: " + Q[front].namaNasabah);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear(){
        if (!IsEmpty()) {
            System.out.println("\n** Antrian paling belakang **");
            System.out.println("-----------------------------------");  
            System.out.println("Nomor Rekening\t: " + Q[rear].nomorRekening);
            System.out.println("Nama Nasabah\t: " + Q[rear].namaNasabah);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(String nama){
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            posisi = 0;
            while (i != rear) {
                if(nama.equalsIgnoreCase(Q[i].namaNasabah)){
                    System.out.println("\n** Posisi antrian ke-" + i +" **");
                    System.out.println("-----------------------------------");  
                    System.out.println("Nomor Rekening\t: " + Q[i].nomorRekening);
                    System.out.println("Nama Nasabah\t: " + nama);
                } else {
                    posisi = -1;
                }
                i = (i+1) % max;
            }

            if (i >= front && i <= rear) {
                if(nama.equalsIgnoreCase(Q[i].namaNasabah)){
                    System.out.println("\n** Posisi antrian ke-" + i +" **");
                    System.out.println("-----------------------------------");  
                    System.out.println("Nomor Rekening\t: " + Q[i].nomorRekening);
                    System.out.println("Nama Nasabah\t: " + nama);
                }
            } else {
                if(nama.equalsIgnoreCase(Q[i].namaNasabah)){
                    System.out.println("\n** Posisi antrian ke-" + i +" **");
                    System.out.println("-----------------------------------");  
                    System.out.println("Nomor Rekening\t: " + Q[i].nomorRekening);
                    System.out.println("Nama Nasabah\t: " + nama);
                } else {
                    if (posisi == -1) {
                        System.out.println("Nasabah tidak ada!");                        
                    }
                }                      
            }
        }
    }

    public void peekAt(int position){
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            posisi = 0;
            while (i != rear) {
                if(position == i){
                    System.out.println("\n** Posisi antrian ke-" + i +" **");
                    System.out.println("-----------------------------------");  
                    System.out.println("Nomor Rekening\t: " + Q[i].nomorRekening);
                    System.out.println("Nama Nasabah\t: " + Q[i].namaNasabah);
                } else {
                    posisi = -1;
                }
                i = (i+1) % max;
            }

            if (position >= front && position <= rear) {
                if(position == i){
                    System.out.println("\n** Posisi antrian ke-" + i +" **");
                    System.out.println("-----------------------------------");  
                    System.out.println("Nomor Rekening\t: " + Q[i].nomorRekening);
                    System.out.println("Nama Nasabah\t: " + Q[i].namaNasabah);
                } 
            } else {
                if(position == i){
                    System.out.println("\n** Posisi antrian ke-" + i +" **");
                    System.out.println("-----------------------------------");  
                    System.out.println("Nomor Rekening\t: " + Q[i].nomorRekening);
                    System.out.println("Nama Nasabah\t: " + Q[i].namaNasabah);
                } else {
                    if (posisi == -1) {
                        System.out.println("Posisi antrian tidak ada!");                        
                    }
                }                      
            }
        }
    }

    public void print(){
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("-----------------------------------");  
            int i = front;
            while (i != rear) {
                System.out.println("** Posisi antrian ke-" + i +" **");
                System.out.println("-----------------------------------");  
                System.out.println("Nomor Rekening\t: " + Q[i].nomorRekening);
                System.out.println("Nama Nasabah\t: " + Q[i].namaNasabah);
                System.out.println();
                i = (i+1) % max;
            }
            System.out.println("\n** Posisi antrian ke-" + i +" **");
            System.out.println("-----------------------------------");  
            System.out.println("Nomor Rekening\t: " + Q[i].nomorRekening);
            System.out.println("Nama Nasabah\t: " + Q[i].namaNasabah);
            System.out.println("-----------------------------------");  
            System.out.println("Jumlah antrian\t: " + size);
        }
    }

    public void Enqueue(Nasabah nama){
        if (IsFull()) {
            System.out.println("Antrian Sudah Penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = nama;
            size++;
        }
    }

    public void Dequeue(){
        String noRek = "";
        String nama = "";
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            noRek = Q[front].nomorRekening;
            nama = Q[front].namaNasabah;
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
            System.out.println("\n** Data yang dikeluarkan ** ");
            System.out.println("-----------------------------------"); 
            System.out.println("Nomor Rekening\t: " + noRek);
            System.out.println("Nama Nasabah\t: " + nama);
        }
    }
}