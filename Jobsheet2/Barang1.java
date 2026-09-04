package Jobsheet2;

public class Barang1 {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public void tampilBarang1(){
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon : " + diskon + "%");
        System.out.println("Harga Jual : " + hitungHargaJual());
    }

    public double hitungHargaJual(){
        double hargaJual = hargaDasar - (diskon / 100) * hargaDasar;
        return hargaJual;
    }
}
