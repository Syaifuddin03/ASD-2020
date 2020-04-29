package Tugas.Nomor_1;

public class LinkedListsMahasiswa {
    NodeMahasiswa head;
    int size;

    public LinkedListsMahasiswa(){
        head = null;
        size = 0;
    }

    public boolean IsEmpty(){
        return head == null;
    }
    
    /* ============= ADD DATA ===============  */

    // Menambahkan data di awal node
    public void addFirst(int nim, String nama, String alamat){
        head = new NodeMahasiswa(nim, nama, alamat, head);
        size++;
        pesanAdd();
    }

    // Menambahkan data di antara data
    public void add(int nim, String nama, String alamat, int index) throws Exception{
        if (index < 0 || index > size) {
            throw new Exception("\n*-------------------------------*\n|  Nilai Index diluar batas    |\n*-------------------------------*"); 
        } else if (IsEmpty() || index == 0) {
            addFirst(nim, nama, alamat);
            pesanAdd();
        } else {
            NodeMahasiswa tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            NodeMahasiswa next = (tmp == null) ? null : tmp.next;
            tmp.next = new NodeMahasiswa(nim, nama, alamat, next);
            pesanAdd();
        }
        size++;
    }

    // Menambahkan data di akhir node
    public void addLast(int nim, String nama, String alamat){
        if (IsEmpty()) {
            addFirst(nim, nama, alamat);
            pesanAdd();
        } else {
            NodeMahasiswa tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new NodeMahasiswa(nim, nama, alamat, null);
            pesanAdd();
        }
        size++;
    }

    // Menambahkan data berdasarkan letak inputan value user
    public void addByValue(int nim, String nama, String alamat, int cari) throws Exception{
        if (IsEmpty() || (getIndex(cari) == 0)) {
            addFirst(nim, nama, alamat);
        } else {
            NodeMahasiswa tmp = head;
            for (int i = 1; i < getIndex(cari); i++) {
                tmp = tmp.next;
            }
            NodeMahasiswa next = (tmp == null) ? null : tmp.next;
            tmp.next = new NodeMahasiswa(nim, nama, alamat, next);
        }
        pesanAdd();
        size++;
    }
    
    /* ============= GET DATA ===============  */

    // Mencari Index pada data
    public int getIndex(int nim){
        int index = 0;
        NodeMahasiswa tmp = head;
        while (tmp != null) {
            if (nim == tmp.next.nim) {
                return index+1;
            } 
            if ((tmp.nim == nim) && (tmp == head)){
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
            throw new Exception("\n*-------------------------------*\n|      LinkedListsMaha Kosong      |\n*-------------------------------*"); 
        }
        return head.nim;
    }

    // Mencari data yang berada di akhir node
    public int getLast() throws Exception{
        if (IsEmpty()) {
            throw new Exception("\n*-------------------------------*\n|      LinkedListsMaha Kosong      |\n*-------------------------------*"); 
        }
        NodeMahasiswa tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.nim;
    }

    // Mencari data berdasarkan inputan value user
    public void getKey(int nim) throws Exception {
        if (IsEmpty()) {
            throw new Exception("\n*-------------------------------*\n|      LinkedListsMaha Kosong      |\n*-------------------------------*"); 
        } else {
            NodeMahasiswa tmp = head;
            while(tmp != null){
                if (nim == tmp.next.nim) {
                    pesanSearch();
                    int idx = getIndex(nim);
                    printGetData(idx);
                }
                if ((tmp.nim == nim) && (tmp == head)){
                    getFirst();
                    pesanSearch();
                    int idx = getIndex(nim);
                    printGetData(idx);
                } 
                tmp = tmp.next;
            }
        }
    }

    // Mencetak Hasil dari pencarian method getKey
    public void printGetData(int idx){
        NodeMahasiswa tmp = head;
        for (int i = 0; i < size; i++) {
            if (idx == i) {
                System.out.println("*-------*----------*------------*");
                System.out.printf("| %-5s | %-8s | %-10s |\n", "NIM", "Nama", "Alamat");
                System.out.println("*-------*----------*------------*");
                System.out.printf("| %-5d | %-8s | %-10s |", tmp.nim, tmp.nama, tmp.alamat);
                System.out.println("\n*-------*----------*------------*\n");
            }
            tmp = tmp.next;
        }
    }

    // Mencari data berdasarkan inpuran index user
    public void get(int index) throws Exception{
        if (IsEmpty() || index >= size) {
            throw new Exception("\n*-------------------------------*\n|  Nilai Index diluar batas    |\n*-------------------------------*"); 
        }
        NodeMahasiswa tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;   
        }
        pesanSearch();
        System.out.println("*-------*----------*------------*");
        System.out.printf("| %-5s | %-8s | %-10s |\n", "NIM", "Nama", "Alamat");
        System.out.println("*-------*----------*------------*");
        System.out.printf("| %-5d | %-8s | %-10s |", tmp.nim, tmp.nama, tmp.alamat);
        System.out.println("\n*-------*----------*------------*\n");
    }
    /* ============= REMOVE DATA ===============  */

    // Menghapus data berdasarkan inputan index user
    public void remove(int index) throws Exception{
        if (IsEmpty() || index >= size) {
            throw new Exception("\n*-------------------------------*\n|  Nilai Index diluar batas    |\n*-------------------------------*"); 
        } else if (index == 0){
            removeFirst();
        } else {
            NodeMahasiswa prev = head;
            NodeMahasiswa cur = head.next;
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
    public void removeByValue(int nim) throws Exception {
        if (IsEmpty()) {
            throw new Exception("\n*-------------------------------*\n|      LinkedListsMaha Kosong      |\n*-------------------------------*"); 
        } else {
            NodeMahasiswa tmp = head;
            while(tmp != null){
                if (nim == tmp.next.nim) {
                    pesanRemove();
                    tmp.next = tmp.next.next;
                    break;
                }
                if ((tmp.nim == nim) || (tmp == head)){
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
            NodeMahasiswa tmp = head;
            while(tmp != null){
                System.out.printf("| %-5d | %-8s | %-10s |", tmp.nim, tmp.nama, tmp.alamat);
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println("*-------*----------*------------*\n");
        } else {
            System.out.println("|       LinkedListsMaha Kosong      |");
            System.out.println("*-------------------------------*");
        }
    }

    /* TAMPIL PESAN*/
    public void pesanRemove(){
        System.out.println("*-------------------------------*");
        System.out.println("|     Data berhasil dihapus     |");
        System.out.println("*-------------------------------*");
    }

    public void pesanAdd(){
        System.out.println("*-------------------------------*");
        System.out.println("|     Data berhasil ditambah    |");
        System.out.println("*-------------------------------*");

    }
    
    public void pesanSearch(){
        System.out.println("*-------------------------------*");
        System.out.println("|    Data berhasil ditemukan    |");
        System.out.println("*-------------------------------*");

    }

    public void pesanExit(){
        System.out.println("*-------------------------------*");
        System.out.println("|    Anda keluar dari sistem    |");
        System.out.println("*-------------------------------*");
    }
}