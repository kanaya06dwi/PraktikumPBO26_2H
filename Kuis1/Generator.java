package Kuis1;

public class Generator {
    private int daya;
    private int voltase; 

    public Generator() { // Constuktor kosong
    }
    public Generator(int daya, int voltase){ // construktor dengan parameter
        this.daya = daya;
        this.voltase = voltase;
    }
    public int getDaya(){ // getter dan setter untuk daya
        return daya;
    }
   public void setDaya(int daya) {
        this.daya = daya;
    }
    public int getVoltase(){  // getter dan setter untuk voltase
        return voltase;
    }
    public void setVoltase(int voltase){
        this.voltase = voltase;
    }
}