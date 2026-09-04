package Jobsheet2;

public class Toko {
    public String idOrg;
    public String namaMember;
    public String namaGame;
    public double harga;
    public int lamaSewa;

    public void tampilToko(){
        System.out.println("ID Member : " + idOrg);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game : " + namaGame);
        System.out.println("Harga : " + harga);
        System.out.println("Lama Sewa : " + lamaSewa);
    }
public int hitungHargaBayar (int lamaSewa){
    int hargaBayar = (int) (harga * lamaSewa);
        return hargaBayar;
    }
}
