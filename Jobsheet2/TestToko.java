package Jobsheet2;

public class TestToko {
    public static void main(String[] args) {
        Toko tko1 = new Toko();
        tko1.idOrg = "A001";
        tko1.namaMember = "Rizky";
        tko1.namaGame = "Mobile Legend";
        tko1.harga = 5000;
        tko1.lamaSewa = 3;
        tko1.tampilToko();
        // menampilkan dan mengisi argumen untuk menghitung harga bayar
        System.out.println("Harga Bayar adalah : " + tko1.hitungHargaBayar(tko1.lamaSewa));
}
}
