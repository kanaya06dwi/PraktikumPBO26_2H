package Jobsheet12.TugasSlidePPT;

public class Manusia {
    public void MakanBuah (buah x){
        if (x instanceof Apel){
            System.out.println("Apel langsung dimakan");
            ((Apel)x).TampilkanBiji();
            ((Apel)x).TampilkanKandungan();
        }
        else if (x instanceof Pisang) {
            System.out.println("Pisang dikupas terlebih dahulu");
            ((Pisang)x).TampilkanKulit();
            ((Pisang)x).TampilkanKandungan();
        }
        else if (x instanceof Durian){
            System.out.println("Durian dibelah terlebih dahulu");
            ((Durian)x).TampilkanKandungan();
        }
        System.out.println("Rasanya " + x.Rasa);
    }
}
