package Percobaan;

public class LinkedLists {
    Node head;
    int size;

    public LinkedLists(){
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

    public void add(int item, int index) throws Exception{
        if (index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas"); 
        } else if (IsEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
        }
        size++;
    }

    public void addLast(int item){
        if (IsEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
        }
        size++;
    }

    public void addByValue(int item, int cari) throws Exception{
        if (getIndex(cari) < 0 || getIndex(cari) > size) {
            throw new Exception("Nilai index diluar batas"); 
        } else if (IsEmpty() || getIndex(cari) == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < getIndex(cari); i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
        }
        size++;
    }
    
    public int getIndex(int key){
        int index = 0;
        Node tmp = head;
        while (tmp != null) {
            if (key == tmp.next.data) {
                return index+1;
            } 
            if ((tmp.data == key) && (tmp == head)){
                return index = 0;
            }
            index++;
            tmp = tmp.next;
        }
        return -1;
    }

    public int getFirst() throws Exception{
        if (IsEmpty()) {
            throw new Exception("LinkedLists Kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception{
        if (IsEmpty()) {
            throw new Exception("LinkedLists Kosong");
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void getKey(int key) throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked List Kosong");
        } else {
            Node tmp = head;
            while(tmp != null){
                if (key == tmp.next.data) {
                    System.out.println("Nilai " + key + " berhasil ditemukan di index " + getIndex(key));

                } 
                if ((tmp.data == key) && (tmp == head)){
                    getFirst();
                    System.out.println("Nilai " + key + " berhasil ditemukan di index " + getIndex(key));
                }
                tmp = tmp.next;
            }
        }
    }

    public int get(int index) throws Exception{
        if (IsEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;   
        }
        return tmp.data;
    }

    public void remove(int index) throws Exception{
        if (IsEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
            System.out.println("Data berhasil dihapus.");
        }
    }

    public void removeByValue(int nilai) throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked List Kosong");
        } else {
            Node tmp = head;
            while(tmp != null){
                if (nilai == tmp.next.data) {
                    System.out.println("Data berhasil dihapus.");
                    tmp.next = tmp.next.next;
                    break;
                }
                if ((tmp.data == nilai) && (tmp == head)){
                    removeFirst();
                    break;
                }
                tmp = tmp.next;
            }
        }
    }

    public void removeFirst() throws Exception{
        head = head.next;
        size--;
        System.out.println("Data berhasil dihapus.");
    }

    public void clear(){
        head = null;
        size = 0;
        System.out.println("\nClear data berahasil.");
    }

    public void print(){
        if (!IsEmpty()) {
            Node tmp = head;
            while(tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists Kosong");
        }
    }
}