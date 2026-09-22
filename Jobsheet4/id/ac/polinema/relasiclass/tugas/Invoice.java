package id.ac.polinema.relasiclass.tugas;

public class Invoice {
    private String idNota;
    private double totalBiaya;

    public Invoice(String idNota, double totalBiaya) {
        this.idNota = idNota;
        this.totalBiaya = totalBiaya;
    }

    public void print(String platNomor) {
        System.out.println("--- NOTA PEMBAYARAN BENGKEL ---");
        System.out.println("No. Nota   : " + idNota);
        System.out.println("Kendaraan  : " + platNomor);
        System.out.println("Total Biaya: Rp " + String.format("%,.2f", totalBiaya));
        System.out.println("Status     : LUNAS");
        System.out.println("-------------------------------");
    }
}
