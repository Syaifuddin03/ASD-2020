package Tugas;

/**
 * Reserve
 */
public class Reverse {
    int panjang, top, max;
    String kalimat = "";
    String[] kata;

    public Reverse(int max, String kalimat){
        this.max = max;
        this.kalimat = kalimat;
        panjang = kalimat.length();
        kata = new String[max];
        top = -1;
    }

    public boolean IsFull(){
        if (top == max - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(String temp){
        if (!IsFull()) {
            top++;
            kata[top] = temp;
        } else {
            System.out.println("\n\t\tJumlah kata melebihi maximum!");
        }
    }

    public String pop(int pop){
        String temp = kata[top];
        top--;
        return temp;
    }

    public void reserveKalimat(){
        String temp = "";
        for (int i = 0; i < panjang; i++) {
            temp += String.valueOf(kalimat.charAt(i));
            if (kalimat.charAt(i) == ' ') {
                push(temp);
                temp = "";
            }
        }
        push(temp);
    } 

    public void print(){
        String temp = "";
        for (int i = top; i >= 0; i--) {
            temp += pop(i) + " ";
        }
        System.out.println("\nKalimat terbalik\t\t: " + temp);
    }
}