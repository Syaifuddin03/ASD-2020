package Tugas;

/**
 * Tugas3
 */
public class Tugas3 {
    int[] data;
    int jumData;

    public Tugas3(int[] Data, int jumData) {
        this.jumData = jumData;
        data= new int[jumData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    public void sorting(int[] data){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] < data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    public void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.printf("| %-2d", arr[i]);
        }
        System.out.println("|");
    }

    public int FindBinarySearch(int data[], int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == data[mid]) {
                return mid;
            } else if (data[mid] > cari) {
                return FindBinarySearch(data, cari, left, mid-1);
            } else {
                return FindBinarySearch(data, cari, mid + 1, right);
            }              
        }
        return -1;
    }

    public void TampilPosisi(int x, int pos){
        System.out.println("-----------------------------------------");
        if (pos != -1) {
            System.out.printf("Nilai %d dapat ditemukan di indeks ke-%d\n", x,pos);
        } else {
            System.out.printf("Nilai %d tidak dapat ditemukan\n", x);
        }
        System.out.println("-----------------------------------------\n");
    }

    public void CekNilaiMax(int data[]){
        int max = 0;
        int jmlh = 0;
        int i = 0;
        int[] index = new int[10];

        for (int j = 0; j < data.length; j++) {
            if (data[j] >= max) {
                max = data[j];
            }
        }

        for (int j = 0; j < data.length; j++) {
            if (data[j] == max) {
                jmlh++;
                index[i] = j;
                i++;
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println("Nilai terbesar dari array\t: "+max);
        System.out.println("-----------------------------------------\n");
        System.out.println("-----------------------------------------");
        System.out.println("Jumlah data terbesar dari array\t: "+jmlh);
        System.out.println("-----------------------------------------\n");
        System.out.println("-----------------------------------------");
        System.out.print("Letak data terbesar pada index ke-: ");
        for (int j = 0; j < i; j++) {
            System.out.print(index[j]+", ");
        }
        System.out.println("\n-----------------------------------------\n");
    }
}