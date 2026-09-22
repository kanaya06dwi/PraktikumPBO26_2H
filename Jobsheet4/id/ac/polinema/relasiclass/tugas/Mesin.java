package id.ac.polinema.relasiclass.tugas;

public class Mesin {
    private int kapasitasCc;
    private String tipe;

    public Mesin(int kapasitasCc, String tipe) {
        this.kapasitasCc = kapasitasCc;
        this.tipe = tipe;
    }

    public void info() {
        System.out.println("Mesin    : " + tipe + " (" + kapasitasCc + " cc)");
    }
}
