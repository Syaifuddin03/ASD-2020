package Tugas.Nomor_1;

/**
 * DaftarTiket
 */
public class DaftarTiket {
    Tiket[] ticket = new Tiket[10];

    int a;

    void tambah(Tiket tiket) {
        ticket[a] = tiket;
        a++;
    }

    void tampil() {
        for (Tiket tiket : ticket) {
            tiket.tampil();
            System.out.println("-------------------------------------------------------------------------------");
        }
    }

    void bubbleSort(String filt) {
        if (filt.equalsIgnoreCase("D")) {
            for (int i = 0; i < ticket.length - 1; i++) {
                for (int j = 1; j < ticket.length - i; j++) {
                    if (ticket[j].harga > ticket[j - 1].harga) {
                        // Swap
                        Tiket temp = ticket[j];
                        ticket[j] = ticket[j - 1];
                        ticket[j - 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < ticket.length - 1; i++) {
                for (int j = 1; j < ticket.length - i; j++) {
                    if (ticket[j].harga < ticket[j - 1].harga) {
                        // Swap
                        Tiket temp = ticket[j];
                        ticket[j] = ticket[j - 1];
                        ticket[j - 1] = temp;
                    }
                }
            }
        }
    }

    void selectionSort(String filt) {
        if (filt.equalsIgnoreCase("D")) {
            for (int i = 0; i < ticket.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < ticket.length; j++) {
                    if (ticket[j].harga > ticket[min].harga) {
                        min = j;
                    }
                }
                // Swap
                Tiket temp = ticket[min];
                ticket[min] = ticket[i];
                ticket[i] = temp;
            }
        } else {
            for (int i = 0; i < ticket.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < ticket.length; j++) {
                    if (ticket[j].harga < ticket[min].harga) {
                        min = j;
                    }
                }
                // Swap
                Tiket temp = ticket[min];
                ticket[min] = ticket[i];
                ticket[i] = temp;
            }
        }
    }

}