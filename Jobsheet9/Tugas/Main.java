package Jobsheet9.Tugas;

public class Main {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Keledai", 4, "Hehehehe", "Abu-Abu");
        Gorila gorilla = new Gorila("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        Singa singa = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");

        keledai.displayData();
        gorilla.displayData();
        singa.displayData();
    }
}
