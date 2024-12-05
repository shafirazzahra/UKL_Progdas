package ukl;

public class TabunganSiswa {
    public static void main(String[] args) {
        int tabunganAwal = 100000;
        int kenaikanTabungan = 50000;
        int jumlahBulan = 12;

        hitungTabungan(tabunganAwal, kenaikanTabungan, jumlahBulan);
    }

    public static void hitungTabungan(int tabunganAwal, int kenaikanTabungan, int jumlahBulan) {
        int totalTabungan = 0;

        System.out.println("Perhitungan Tabungan Selama " + jumlahBulan + " Bulan:");

        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            totalTabungan += kenaikanTabungan;
            System.out.println("Bulan ke-" + bulan + ": Rp" + totalTabungan);
            totalTabungan += kenaikanTabungan;
        }

        System.out.println("\n Total tabungan setelah " + jumlahBulan + " bulan: Rp" + totalTabungan);
    }
}
        
            

