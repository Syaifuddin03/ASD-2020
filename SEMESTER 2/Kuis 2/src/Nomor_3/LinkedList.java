package Nomor_3;

/**
* * Syaifuddin Zuhri
* ? 1941720013
*/

import java.util.Stack;

public class LinkedList {
    Node head;
    int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public boolean IsEmpty(){
        return head == null;
    }
    
    public void addFirst(int item){
        head = new Node(item, head);
        size++;
    }

    public void addLast(int item) {
        if (IsEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
        }
        size++;
    }
    
    public void reverseLinkedLists () {
        Stack<Node> stk = new Stack<Node>();
        Node ptr = head;
        while (ptr != null) {
            stk.push(ptr);
            ptr = ptr.next;
        }
        System.out.print("Kebalikan => | ");
        while (stk.size() > 0) {
            System.out.print(stk.peek().data + " | ");
            stk.pop();
        }
        System.out.println("");
    }

    public void print() {
        if (!IsEmpty()) {
            Node tmp = head;
            System.out.print("Awal      => | ");
            while (tmp != null) {
                System.out.print(tmp.data + " | ");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists Kosong");
        }
    }
}
