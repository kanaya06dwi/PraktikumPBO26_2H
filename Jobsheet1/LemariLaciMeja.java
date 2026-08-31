package Jobsheet1;

public class LemariLaciMeja extends Lemari {
    private int jumlahLaci;
    private boolean adaKunci;

    public void setJumlahLaci(int laci){
        this.jumlahLaci = laci;
    }
    public void setAdaKunci(boolean status){
        this.adaKunci = status;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("=== Info Lemari Laci Meja Dosen ===");
        super.cetakInfo();
        System.out.println("Jumlah Laci : " + jumlahLaci);
        System.out.println("Ada Kunci : " + (adaKunci ? "Ya" : "Tidak") + "\n");
    }
    
}
