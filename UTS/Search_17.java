package UTS;

/**
 * Sequential
 */
public class Search_17{
    public int[] data;
    public int i;
    public int[] index;
    public int jumData;

    public Search_17(int jumData){
        index = new int[jumData];
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
        System.out.print("| ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
    }

    public int FindSeqSearch(int cari, int[] data){
        int posisi = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisiSeqSearch(int cari, int posisi, int[] data){
        if (posisi != -1) {
            i = 0;
            for (int j = 0; j < data.length; j++) {
                if (data[j] == cari) {
                    index[i] = j;
                    i++;
                } 
            }

            System.out.print("Angka " + cari + " ditemukan indeks ke- ");
            for (int j = 0; j < i; j++) {
                if (j == i-1) {
                System.out.print("dan "+ index[j] + " ");
                } else {
                    System.out.print(index[j]+", ");
                }
            }
            System.out.println("menggunakan Sequential Seacrh");
        } else {
            System.out.print("Angka " + cari + " tidak dapat ditemukan\n");
        }

    }
}