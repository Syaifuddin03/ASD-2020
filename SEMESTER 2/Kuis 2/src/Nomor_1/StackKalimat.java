package Nomor_1;

public class StackKalimat {
    int size, top;
    String data[];

    public StackKalimat(int size) {
        this.size = size;
        data = new String[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == - 1) return true;
        else return false;
    }

    public boolean IsFull(){
        if (top == size - 1) return true;
        else return false;
    }

    public void push(String dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("\n\t\tIsi Stack Penuh!");
        }
    }

    public String p(int top) {
        String temp = data[top];
        top--;
        return temp;
    }

    public void balikKata (String kalimat) {
        String temp = "";
        for (int i = 0; i < kalimat.length(); i++) {
            temp = String.valueOf(kalimat.charAt(i));
            push(temp);
        }
    }

    public void print(){
        System.out.println("\n*** Isi Awal Stack ***");
        System.out.println("--------------------------");
        for (int i = 0; i <= top; i++) {
            System.out.printf("%s ", data[i]);
        }
        System.out.println("\n--------------------------");
        System.out.println("\n*** Balik Isi Stack ***");
        String temp = "";
        System.out.println("--------------------------");
        for (int i = top; i >= 0; i--) {
            temp += p(i) + " ";
        }
        System.out.println(temp);
        System.out.println("--------------------------");
    }
}