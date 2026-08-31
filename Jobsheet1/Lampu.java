package Jobsheet1;

public class Lampu {
    private String warnaCahaya;
    private int dayaWatt;

    public void setWarnaCahaya(String warna){
        this.warnaCahaya = warna;
    }

    public void setDayaWatt(int watt){
        this.dayaWatt = watt;
    }
    public void cetakInfo() {
        System.out.println("=== Info Lampu ===");
        System.out.println("Warna Cahaya : " + warnaCahaya);
        System.out.println("Daya Watt : " + dayaWatt + " Watt\n");
    }
}
