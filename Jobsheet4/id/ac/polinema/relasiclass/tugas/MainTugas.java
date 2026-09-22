package id.ac.polinema.relasiclass.tugas;

public class MainTugas {
    public static void main(String[] args) {
        // 1. Uji Aggregation: Buat Mekanik secara mandiri di luar Motor
        Mekanik mkn = new Mekanik("Budi Santoso", "Injeksi & Kelistrikan");

        // 2. Uji Composition: Buat Motor (Mesin otomatis ter-instansiasi di dalamnya)
        Motor motor = new Motor("N 1234 AB", 150, "4-Tak DOHC");
        motor.setMekanik(mkn); // Inject Mekanik ke Motor

        // Tampilkan info motor
        motor.infoMotor();

        // 3. Uji Dependency: Buat Invoice sesaat lalu kirimkan ke method cetakNota
        Invoice notaServis = new Invoice("INV-2026-001", 175000);
        motor.cetakNota(notaServis);
    }
}
