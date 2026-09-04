package Jobsheet2;

public class Lingkaran {
    public double phi;
    public double r;

    public void hitungLuas(){
        double luas = phi * r * r;
        System.out.println("Luas Lingkaran : " + luas);
    }
    public void hitungKeliling(){
        double keliling = 2 * phi * r;
        System.out.println("Keliling Lingkaran : " + keliling);
    }
}
