package Tugas;

/**
 * Prefix
 */
public class Prefix {
    char[] data;
    int top = -1, size;
    String P, temp;
    
    public Prefix(String dt){
        size = dt.length();
        data = new char[size];
    }

    public boolean IsEmpty(){
        return top == -1? true : false;
    }
    
    public void push(char c){
        top++;
        data[top] = c;
    }

    public char pop(){
        return data[top--];
    }

    public char peek(){
        return data[top];
    }

    public boolean IsOperand(char c){
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsOperator(char c){
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    public static int presedence (char c){
        switch (c) {
            case '^': return 3;
            case '%': return 2;
            case '/': return 2;
            case '*': return 2;
            case '-': return 1;
            case '+': return 1;
            default: return 0;
        }
    }

    public String konversi(String Q){
        P = "";
        char c;
        for (int i = size-1; i >= 0; i--) {
            c = Q.charAt(i);
            if(Character.isLetter(c))
                P = P + c;
            else if(c ==')'){
                push(c);
            } else if(c=='(') {
                while(peek()!=')'){
                    P =   P + pop();
                }
                pop();
            } else {
                if(!IsEmpty() && !(peek()==')') && presedence(peek()) >= presedence(c)){
                  P =  P + pop();
                }
                push(c);
            }
        }
        while(!IsEmpty()){
            P =  P + pop();
        }
        return P;
    }

    public void print(){
        System.out.print("Prefix\t\t\t\t: ");
        for (int i = 0; i <= P.length()-1; i++) {
            System.out.print(P.charAt(i));
        }
    }
}