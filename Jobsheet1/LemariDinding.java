package Jobsheet1;

public class LemariDinding extends Lemari {
    private int jumlahPintu;
    private boolean adaCermin;

    public void setJumlahPintu(int pintu){
        this.jumlahPintu = pintu;
    }
    public void setAdaCermin(boolean status){
        this.adaCermin = status;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("=== Info Lemari Dinding ===");
        super.cetakInfo();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
        System.out.println("Ada Cermin : " + (adaCermin ? "Ya" : "Tidak") + "\n");
    }
    
}
