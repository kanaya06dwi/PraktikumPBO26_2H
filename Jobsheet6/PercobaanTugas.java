package Jobsheet6;

public class PercobaanTugas {
    public static void main(String[] args) {
        // 1. Objek TiketKereta menggunakan konstruktor tanpa parameter
        System.out.println("==== Tiket Kereta ======");
        TiketKereta tk = new TiketKereta();
        tk.kodeTiket = "KA-001";
        tk.namaPenumpang = "Andi";
        tk.asal = "Malang";
        tk.tujuan = "Jakarta";
        tk.hargaDasar = 350000;
        tk.nomorGerbong = 3;
        tk.nomorKursi = "12A";
        tk.tampilKereta();

        // 2. Objek TiketDomestik menggunakan konstruktor berparameter
        System.out.println("\n======== Tiket Pesawat Domestik ========");
        TiketDomestik td = new TiketDomestik("GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000);
        td.tampilDomestik();

        // 3. Objek TiketInternasional menggunakan konstruktor berparameter
        System.out.println("\n====== Tiket Pesawat Internasional ======");
        TiketInternasional ti = new TiketInternasional("SQ-205", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000);
        ti.tampilInternasional();
    }
}
