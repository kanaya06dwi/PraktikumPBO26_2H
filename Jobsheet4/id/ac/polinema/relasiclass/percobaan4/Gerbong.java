package id.ac.polinema.relasiclass.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
public void setPenumpang(Penumpang penumpang, int nomor) {
    int index = nomor - 1;
    if (index >= 0 && index < arrayKursi.length) {
        if (this.arrayKursi[index].getPenumpang() == null) {
            this.arrayKursi[index].setPenumpang(penumpang);
        } else {
            System.out.println("Kursi nomor " + nomor + " sudah terisi oleh penumpang lain!");
        }
    } else {
        System.out.println("Nomor kursi tidak valid!");
    }

    }
    public String info() {
        String info = "";
        info += "kode: " + kode + "\n";
        for(Kursi kursi : arrayKursi){
            info += kursi.info();
        }
        return info;
    }
}

