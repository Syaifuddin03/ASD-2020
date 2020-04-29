package Latihan;

/**
 * Stack
 */
public class Stack {
    int size, top, data[];

    public Stack(int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }

    // Mengecek stack kosong
    public boolean IsEmpty(){
        if (top == - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Mengecek stack penuh
    public boolean IsFull(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push (int dt){
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("\n\t\tIsi Stack Penuh!");
        }
    }

    public void pop(){
        if (!IsEmpty()) {
            int x = data[top];
            top--;
            System.out.println("Data yang keluar\t\t: " + x);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek(){
        System.out.println("Elemen teratas\t\t\t: " + data[top]);
    }

    public void print(){
        System.out.println("\t   *** Isi Stack ***\n");
        for (int i = top; i >= 0; i--) {
            System.out.println("\t\t------");
            System.out.printf("\t\t| %-2d |\n", data[i]);
        }
        System.out.println("\t\t------\n");
    }

    public void clear(){
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("\n    Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}