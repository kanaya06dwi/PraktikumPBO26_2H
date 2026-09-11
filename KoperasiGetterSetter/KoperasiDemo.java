package KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Kanaya", "Jl. candi");
        System.out.println("Simpanan " + anggota1.getNama()+ " : Rp " + anggota1.getSimpanan());

        anggota1.setNama("Kanaya Dwi");
        anggota1.setAlamat("jl.Candi");
        anggota1.setor(1000000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp "+ anggota1.getSimpanan());
    }
}
