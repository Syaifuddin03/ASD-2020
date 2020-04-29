package TestSearching;

/**
 * Searching
 */
public class Searching {
    public int[] data;
    public int jumData;

    public Searching(int[] Data, int jumData) {
        this.jumData = jumData;
        data= new int[jumData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int i = 0; i < jumData; i++) {
            if (data[i] == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisiSeqSearch(int pos, int cari){
        if (pos != -1) {
            System.out.println("data : " + cari + " ditemukan di indeks " + pos);
        } else {
            System.out.println("data : " + cari + " tidak ditemukan");
        }
    }

    public void tampilData (){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }   

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == data[mid]) {
                return mid;
            } else if (data[mid] > cari) {
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }              
        }
        return -1;

        //Question Number 3-5 Binary Search
        // int mid;
        // if (data[left] <= data[right]) {
        //     mid = (left + right) / 2;
        //     if (cari == data[mid]) {
        //         return mid;
        //     } else if (data[mid] > cari) {
        //         return FindBinarySearch(cari, left, mid-1);
        //     } else {
        //         return FindBinarySearch(cari, mid + 1, right);
        //     }              
        // } else if(data[left] >= data[right]){
        //     mid = (left + right) / 2;
        //     if (cari == data[mid]) {
        //         return mid;
        //     } else if (data[mid] > cari){
        //         return FindBinarySearch(cari, mid + 1, right);
        //     } else {
        //         return FindBinarySearch(cari, left, mid - 1);
        //     }
        // } else return -1;
    }

    public void TampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan di indeks " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }
}