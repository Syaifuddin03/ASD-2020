package Tugas.Nomor_1;

/**
* * Syaifuddin Zuhri / 1941720013
*/

public class Node {
    int data;
    Node prev, next;

    public Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}