package id.ac.polinema.relasiclass.percobaan3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Kanaya");
        Pegawai asisten = new Pegawai("4567", "Dwi");
        KeretaApi keretaApi = new KeretaApi("Gaya baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
