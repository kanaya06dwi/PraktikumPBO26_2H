package Jobsheet6;

public class TiketKereta extends Tiket {
    protected int nomorGerbong;
    protected String nomorKursi;

    public TiketKereta() {

    }

    public TiketKereta(String kodeTiket, String namaPenumpang, String asal, String tujuan, int getHargaDasar, int nomorGerbong, String nomorKursi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, getHargaDasar);
        this.nomorGerbong = nomorGerbong;
        this.nomorKursi = nomorKursi;
    }

    public void tampilKereta() {
        super.tampilTiket();
        System.out.println("Nomor Gerbong  = " + nomorGerbong);
        System.out.println("Nomor Kursi    = " + nomorKursi);
        System.out.println("Total Bayar    = " + hargaDasar);
    }
}
