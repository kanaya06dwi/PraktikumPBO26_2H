package Jobsheet1;

public class AC {
    private String merk;
    private int suhu;

    public void setMerk(String merk){
        this.merk = merk;
    }
    public void aturSuhu(int targetSuhu){
        this.suhu = targetSuhu;
    }
    public void cetakInfo() {
        System.out.println("=== Info AC ===");
        System.out.println("Merk AC : " + merk);
        System.out.println("Suhu AC : " + suhu + " °C\n");
    }
}
