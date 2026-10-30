package Jobsheet12.TugasSlidePPT;

public class Pisang extends buah {
    public Pisang (){
        Rasa = "Sepet";
        this.KandunganAir = 100;
    }
    public void TampilkanKulit(){
        System.out.println("Kulit pisang berwarna kuning");
    }
    public void TampilkanKandungan(){
        System.out.println("Kandungan air : " + KandunganAir);
    }
}
