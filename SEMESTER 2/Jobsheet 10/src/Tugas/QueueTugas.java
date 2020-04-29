package Tugas;

public class QueueTugas {
    int max, front, size, rear, posisi, Q[];

    public QueueTugas(int max) {
        this.max = max;
        Create();
    }

    public void Create(){
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull(){
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek(){
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan = " + Q[front]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear(){
        if (!IsEmpty()) {
            System.out.println("Elemen terakhir = " + Q[rear]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(int data){
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            posisi = 0;
            while (i != rear) {
                if(data == Q[i]){
                    System.out.println("Data " + data + " berada di posisi : " + i);
                } else {
                    posisi = -1;
                }
                i = (i+1) % max;
            }

            if (data >= Q[front] && data <= Q[rear]) {
                if(data == Q[i]){
                    System.out.println("Data " + data + " berada di posisi : " + i);
                } 
            } else {
                if(data == Q[i]){
                    System.out.println("Data " + data + " berada di posisi : " + i);
                } else {
                    if (posisi == -1) {
                        System.out.println("Data tidak ada!");                        
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
                    System.out.println("Posisi " + i + " memiliki data : " + Q[i]);
                } else {
                    posisi = -1;
                }
                i = (i+1) % max;
            }

            if (position >= front && position <= rear) {
                if(position == i){
                    System.out.println("Posisi " + i + " memiliki data : " + Q[i]);
                } 
            } else {
                if(position == i){
                    System.out.println("Posisi " + i + " memiliki data : " + Q[i]);
                } else {
                    if (posisi == -1) {
                        System.out.println("Posisi tidak ada!");                        
                    }
                }                      
            }
        }
    }

    public void print(){
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i+1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah antrian = " + size);
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