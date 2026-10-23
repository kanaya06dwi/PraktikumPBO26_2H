package Jobsheet9.Tugas;

public class Gorila extends Binatang implements IKarnivora, IHerbivora {
    private String suara;
    private String warnaBulu;

    public Gorila(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis: Karnivora + Herbivora");
        System.out.println("Makanan: Daging + Tumbuhan");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Jumlah Kaki: " + this.jmlKaki);
    }

    public void displayData() {
        displayMakan();
        displayBinatang();
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna Bulu: " + this.warnaBulu);
        System.out.println();
    }

}
