package id.ac.polinema.relasiclass.tugas;

public class Motor {
    private String platNomor;
    
    // 1. Relasi aggregation
    private Mekanik mekanik;
    
    // 2. Relasi composition
    private Mesin mesin;

    public Motor(String platNomor, int kapasitasCc, String tipeMesin) {
        this.platNomor = platNomor;
        // COMPOSITION: Mesin dibuat langsung di dalam constructor Motor (tidak dari parameter luar)
        this.mesin = new Mesin(kapasitasCc, tipeMesin);
    }

    // AGGREGATION: Mekanik di-inject dari luar lewat setter (bisa berganti atau berdiri sendiri)
    public void setMekanik(Mekanik mekanik) {
        this.mekanik = mekanik;
    }

    public void infoMotor() {
        System.out.println("Plat No  : " + platNomor);
        mesin.info(); // Delegasi ke objek mesin
        if (mekanik != null) {
            mekanik.info(); // Guard clause pengecekan null
        } else {
            System.out.println("Mekanik  : Belum ditugaskan");
        }
    }

    // 3. Relasi DEPENDENCY (Uses-A)
    public void cetakNota(Invoice invoice) {
        System.out.println("\nMemproses pencetakan nota untuk motor " + platNomor + "...");
        invoice.print(platNomor); // Memakai objek invoice sesaat
    }
}
