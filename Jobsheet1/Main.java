package Jobsheet1;

public class Main {
    public static void main(String[] args){
        // Objek 1: Ac
        AC acRuangan = new AC();
        acRuangan.setMerk("Daikin");
        acRuangan.aturSuhu(18);
        acRuangan.cetakInfo();

        // Objek 2: Lampu
        Lampu LampuRuangan = new Lampu();
        LampuRuangan.setWarnaCahaya("Putih");
        LampuRuangan.setDayaWatt(18);
        LampuRuangan.cetakInfo();

        // Objek 3: Lemari Dinding
        LemariDinding lemariArsip = new LemariDinding();
        lemariArsip.setMaterial("Kayu Jati");
        lemariArsip.setWarna("Coklat");
        lemariArsip.setJumlahPintu(2);
        lemariArsip.setAdaCermin(false);
        lemariArsip.cetakInfo();
       
        // Objek 4 : Lemari Laci Meja Dosen
        LemariLaciMeja lemariLaciMejaDosen = new LemariLaciMeja();  
        lemariLaciMejaDosen.setMaterial("Plastik");
        lemariLaciMejaDosen.setWarna("Biru");
        lemariLaciMejaDosen.setJumlahLaci(3);
        lemariLaciMejaDosen.cetakInfo();
    }
}
