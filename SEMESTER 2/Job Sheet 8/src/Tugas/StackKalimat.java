package Tugas;

/**
 * StackKalimat
 */
public class StackKalimat {
    int size, top;
    String data[];

    public StackKalimat(int size) {
        this.size = size;
        data = new String[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push (String dt){
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("\n\t\tIsi Stack Penuh!");
        }
    }

    public void pop(){
        if (!IsEmpty()) {
            String x = data[top];
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
        for (int i = 0; i <= top; i++) {
            System.out.printf("%s ", data[i]);
        }
        System.out.println("");
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