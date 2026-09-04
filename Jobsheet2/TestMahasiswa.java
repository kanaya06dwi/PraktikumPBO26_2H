package Jobsheet2;

public class TestMahasiswa {
    public static void main (String args[]){
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Budi";
        mhs1.alamat = "Jl. Merdeka No. 1";
        mhs1.kelas = "TI-1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Kanaya";
        mhs2.alamat = "Jl. Sudirman No. 2";
        mhs2.kelas = "TI-1B";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Zidan";
        mhs3.alamat = "Jl. Thamrin No. 3";
        mhs3.kelas = "TI-1C";
        mhs3.tampilBiodata();
    }
}
