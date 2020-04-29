package Tugas.Nomor_2;

public class LinkedListsBuku {
    NodeBuku head;
    int size;

    public LinkedListsBuku(){
        head = null;
        size = 0;
    }

    public boolean IsEmpty(){
        return head == null;
    }
    
    /* ============= ADD DATA ===============  */

    // Menambahkan data di awal node
    public void addFirst(int kode, String judul){
        head = new NodeBuku(kode, judul, head);
        size++;
        pesanAdd();
    }

    // Menambahkan data di antara data
    public void add(int kode, String judul, int index) throws Exception{
        if (index < 0 || index > size) {
            throw new Exception("\n*-------------------------------*\n|  Nilai Index diluar batas    |\n*-------------------------------*"); 
        } else if (IsEmpty() || index == 0) {
            addFirst(kode, judul);
            pesanAdd();
        } else {
            NodeBuku tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            NodeBuku next = (tmp == null) ? null : tmp.next;
            tmp.next = new NodeBuku(kode, judul, next);
            pesanAdd();
        }
        size++;
    }

    // Menambahkan data di akhir node
    public void addLast(int kode, String judul){
        if (IsEmpty()) {
            addFirst(kode, judul);
            pesanAdd();
        } else {
            NodeBuku tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new NodeBuku(kode, judul, null);
            pesanAdd();
        }
        size++;
    }

    // Menambahkan data berdasarkan letak inputan value user
    public void addByValue(int kode, String judul, int cari) throws Exception{
        if (IsEmpty() || (getIndex(cari) == 0)) {
            addFirst(kode, judul);
        } else {
            NodeBuku tmp = head;
            for (int i = 1; i < getIndex(cari); i++) {
                tmp = tmp.next;
            }
            NodeBuku next = (tmp == null) ? null : tmp.next;
            tmp.next = new NodeBuku(kode, judul, next);
        }
        pesanAdd();
        size++;
    }
    
    /* ============= GET DATA ===============  */

    // Mencari Index pada data
    public int getIndex(int kode){
        int index = 0;
        NodeBuku tmp = head;
        while (tmp != null) {
            if (kode == tmp.next.kode) {
                return index+1;
            } 
            if ((tmp.kode == kode) && (tmp == head)){
                return index = 0;
            }
            index++;
            tmp = tmp.next;
        }
        return -1;
    }

    // Mencari data yang berada di awal node
    public int getFirst() throws Exception{
        if (IsEmpty()) {
            throw new Exception("\n*-------------------------------*\n|      LinkedList Buku Kosong      |\n*-------------------------------*"); 
        }
        return head.kode;
    }

    // Mencari data yang berada di akhir node
    public int getLast() throws Exception{
        if (IsEmpty()) {
            throw new Exception("\n*-------------------------------*\n|      LinkedList Buku Kosong      |\n*-------------------------------*"); 
        }
        NodeBuku tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.kode;
    }

    // Mencari data berdasarkan inputan value user
    public void getKey(int kode) throws Exception {
        if (IsEmpty()) {
            throw new Exception("\n*-------------------------------*\n|      LinkedList Buku Kosong      |\n*-------------------------------*"); 
        } else {
            NodeBuku tmp = head;
            while(tmp != null){
                if (kode == tmp.next.kode) {
                    pesanSearch();
                    int idx = getIndex(kode);
                    printGetData(idx);
                }
                if ((tmp.kode == kode) && (tmp == head)){
                    getFirst();
                    pesanSearch();
                    int idx = getIndex(kode);
                    printGetData(idx);
                } 
                tmp = tmp.next;
            }
        }
    }

    // Mencetak Hasil dari pencarian method getKeys
    public void printGetData(int idx){
        NodeBuku tmp = head;
        for (int i = 0; i < size; i++) {
            if (idx == i) {
                System.out.println("*-------*-----------------------*");
                System.out.printf("| %-5s | %-21s |\n", "Kode", "Nama");
                System.out.println("*-------*-----------------------*");
                System.out.printf("| %-5d | %-21s |", tmp.kode, tmp.judul);
                System.out.println("\n*-------*-----------------------*\n");
            }
            tmp = tmp.next;
        }
    }

    // Mencari data berdasarkan inpuran index user
    public void get(int index) throws Exception{
        if (IsEmpty() || index >= size) {
            throw new Exception("\n*-------------------------------*\n|  Nilai Index diluar batas    |\n*--------------------------------------------------*"); 
        }
        NodeBuku tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;   
        }
        pesanSearch();
        System.out.println("*-------*-----------------------*");
        System.out.printf("| %-5s | %-21s |\n", "Kode", "Judul");
        System.out.println("*-------*-----------------------*");
        System.out.printf("| %-5d | %-21s |", tmp.kode, tmp.judul);
        System.out.println("\n*-------*-----------------------*\n");
    }
    /* ============= REMOVE DATA ===============  */

    // Menghapus data berdasarkan inputan index user
    public void remove(int index) throws Exception {
        if (IsEmpty() || index >= size) {
            throw new Exception(
                    "\n*-------------------------------*\n|  Nilai Index diluar batas    |\n*-------------------------------*");
        } else if (index == 0) {
            removeFirst();
        } else {
            NodeBuku prev = head;
            NodeBuku cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
            pesanRemove();
        }
    }

    
    // Menghapus data berdasarkan inputan value user
    public void removeByValue(int kode) throws Exception {
        if (IsEmpty()) {
            throw new Exception("\n*-------------------------------*\n|      LinkedList Buku Kosong      |\n*-------------------------------*"); 
        } else {
            NodeBuku tmp = head;
            while(tmp != null){
                if (kode == tmp.next.kode) {
                    pesanRemove();
                    tmp.next = tmp.next.next;
                    break;
                }
                if ((tmp.kode == kode) || (tmp == head)){
                    removeFirst();
                    break;
                }
                tmp = tmp.next;
            }
        }
    }


    // Menghapus data yang berada di awal node
    public void removeFirst() throws Exception{
        head = head.next;
        size--;
        pesanRemove();
    }

    // Menghapus semua data yang ada
    public void clear(){
        head = null;
        size = 0;
        pesanRemove();
    }

    /* ============= PRINT DATA ===============  */
    public void print(){
        if (!IsEmpty()) {
            NodeBuku tmp = head;
            while(tmp != null){
                System.out.printf("| %-5d | %-21s |", tmp.kode, tmp.judul);
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println("*-------*-----------------------*\n");
        } else {
            System.out.println("|      LinkedList Buku Kosong   |");
            System.out.println("*-------------------------------*");
        }
    }

    /* TAMPIL PESAN*/
    public void pesanRemove(){
        System.out.println("*-------------------------------*");
        System.out.println("|     Buku berhasil dihapus     |");
        System.out.println("*-------------------------------*");
    }

    public void pesanAdd(){
        System.out.println("*-------------------------------*");
        System.out.println("|     Buku berhasil ditambah    |");
        System.out.println("*-------------------------------*");

    }
    
    public void pesanSearch(){
        System.out.println("*-------------------------------*");
        System.out.println("|    Buku berhasil ditemukan    |");
        System.out.println("*-------------------------------*");

    }

    public void pesanExit(){
        System.out.println("*-------------------------------*");
        System.out.println("|    Anda keluar dari sistem    |");
        System.out.println("*-------------------------------*");
    }
}