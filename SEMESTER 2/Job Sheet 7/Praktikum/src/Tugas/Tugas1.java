package Tugas;

/**
 * Tugas1
 */
public class Tugas1 {
    int[] data;
    int jumData;

    public Tugas1(int[] Data, int jumData) {
        this.jumData = jumData;
        data= new int[jumData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    public void mergeSort(int[] data){
        sort(data, 0, data.length-1);
    }

    private void merge(int data[], int left, int middle, int right){
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }       

        int a = left;
        int b = middle + 1;
        int c = left;
        
        //Membandingkan setiap bagian
        while (a <= middle && b <= right) {
            if (temp[a]<= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }

        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c+i] = temp[a+i];
        }
    }

    private void sort(int data[], int left, int right){
        if (left < right) {
            int middle = (left+right)/2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.printf("| %-4d", arr[i]);
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
        if (pos != -1) {
            System.out.printf("Nilai %d dapat ditemukan di indeks ke-%d\n", x,pos);
        } else {
            System.out.printf("  Nilai %d tidak dapat ditemukan\n", x);
        }
    }
}