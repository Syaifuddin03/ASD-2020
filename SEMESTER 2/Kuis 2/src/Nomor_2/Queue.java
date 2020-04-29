package Nomor_2;

public class Queue {
    int max, front, size, rear, Q[];


    public Queue(int max) {
        this.max = max;
        Create();
    }

    public void Create(){
        Q = new int[max];
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
            System.out.println("Elemen terdepan = " + Q[front]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen terakhir = " + Q[rear]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
 
    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            int balik[] = new int[size];
            int jmlh = 0, tmp;
            System.out.print("Awal      => | ");
            while (i != rear) {
                System.out.print(Q[i] + " | ");
                balik[jmlh] = Q[i];
                jmlh++;
                i = (i + 1) % max;
            }
            System.out.print(Q[i] + " | ");
            tmp = Q[i];
            System.out.println();
            System.out.print("Kebalikan => | ");
            System.out.print(tmp + " | ");
            int j = jmlh - 1;
            while (j >= 0) {
                System.out.print(balik[j] + " | ");
                j--;
            }
            System.out.println();  
        }
    }

    public void Enqueue(int data){
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
            Q[rear] = data;
            size++;
        }
    }

    public int Dequeue(){
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            data = Q[front];
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
        }
        return data;
    }
}