package Tugas.Nomor_2;

import java.util.Scanner;

/**
 * MainPoin
 */
public class MainPoin {
    static String sort;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListPoin data = new ListPoin();
        Poin[] poins = new Poin[20];
        poins[0] = new Poin("Liverpool", 29, 45, 82);
        poins[1] = new Poin("Manchester City", 27, 39, 57);
        poins[2] = new Poin("Leicester", 28, 26, 50);
        poins[3] = new Poin("Chelsea", 29, 9, 48);
        poins[4] = new Poin("Wolverhampton", 29, 7, 43);
        poins[5] = new Poin("Sheffield United", 28, 5, 43);
        poins[6] = new Poin("Manchester United", 28, 12, 42);
        poins[7] = new Poin("Tottenham Hotspur", 29, 7, 41);
        poins[8] = new Poin("Arsenal", 28, 4, 40);
        poins[9] = new Poin("Burnley", 29, -6, 39);
        poins[10] = new Poin("Crystal Palace", 29, -6, 39);
        poins[11] = new Poin("Everton", 29, -6, 37);
        poins[12] = new Poin("Newcastle United", 29, -16, 35);
        poins[13] = new Poin("Southampton", 29, -17, 34);
        poins[14] = new Poin("Brighton & Hove Albion", 29, -8, 29);
        poins[15] = new Poin("West Ham United", 29, -15, 27);
        poins[16] = new Poin("Watford", 29, -17, 27);
        poins[17] = new Poin("AFC Bournemouth", 29, -18, 27);
        poins[18] = new Poin("Aston Villa", 27, -18, 25);
        poins[19] = new Poin("Norwich City", 29, -27, 21);
        data.tambah(poins[0]);
        data.tambah(poins[1]);
        data.tambah(poins[2]);
        data.tambah(poins[3]);
        data.tambah(poins[4]);
        data.tambah(poins[5]);
        data.tambah(poins[6]);
        data.tambah(poins[7]);
        data.tambah(poins[8]);
        data.tambah(poins[9]);
        data.tambah(poins[10]);
        data.tambah(poins[11]);
        data.tambah(poins[12]);
        data.tambah(poins[13]);
        data.tambah(poins[14]);
        data.tambah(poins[15]);
        data.tambah(poins[16]);
        data.tambah(poins[17]);
        data.tambah(poins[18]);
        data.tambah(poins[19]);

        System.out.println("\n\t\t *** PREMIER LEAGUE ***");
        System.out.println("\t\t      ~~ Normal ~~");
        System.out.println("\n+--------------------------------+-----+-----+-----+");
        System.out.println("|             CLUB               |  P  |  GD | PTS | ");
        System.out.println("+--------------------------------+-----+-----+-----+");
        data.tampil();

        boolean loop = true;
            while (loop == true) {
            System.out.println("\n*** Pilih sorting data Ascending atau Descending ***");
            System.out.print("Jawab (A/D)\t: ");
            sort = input.next();
            if (sort.equalsIgnoreCase("A")) {
                    sortAscending(data);
                    loop = false;
            } else if (sort.equalsIgnoreCase("D")) {
                    sortDescending(data);
                    loop = false;
            } else {
                    System.err.println("\n\t\tInput invalid!\n");
            }
        }
    }

    static void sortAscending(ListPoin data){
        System.out.println("\n\t\t *** PREMIER LEAGUE ***");
        System.out.println("\t\t     ~~ Ascending ~~");
        System.out.println("\n+--------------------------------+-----+-----+-----+");
        System.out.println("|             CLUB               |  P  |  GD | PTS | ");
        System.out.println("+--------------------------------+-----+-----+-----+");
        data.filterAscending();
        data.tampil();
    }

    static void sortDescending(ListPoin data){
        System.out.println("\n\t\t *** PREMIER LEAGUE ***");
        System.out.println("\t\t    ~~ Descending ~~");
        System.out.println("\n+--------------------------------+-----+-----+-----+");
        System.out.println("|             CLUB               |  P  |  GD | PTS | ");
        System.out.println("+--------------------------------+-----+-----+-----+");
        data.filterDescending();
        data.tampil();
    }
}