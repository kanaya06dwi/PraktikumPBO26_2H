package id.ac.polinema.relasiclass.tugas;

public class Mekanik {
    private String nama;
    private String keahlian;

    public Mekanik(String nama, String keahlian){
        this.nama = nama;
        this.keahlian = keahlian;
    }
    public String getNama(){
        return nama;
    }
    public String getKeahlian(){
        return keahlian;
    }
    public void info(){
        System.out.println("Mekanik : " + nama + "(Spesialis: " + keahlian + ")");
    }
}
