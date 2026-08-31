package Jobsheet1;

public class Lemari {
    private String material;
    private String warna;

    public void setMaterial(String material){
        this.material = material;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public void cetakInfo() {
        System.out.println("Material Lemari : " + material);
        System.out.println("Warna Lemari : " + warna);
    }
}
