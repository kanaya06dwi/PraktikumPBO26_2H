package Jobsheet7;

public class Utama {
    public static void main(String[] args) {
        System.out.println("Program Testing class manager & staff");
        Manager man[] = new Manager[2];
        Staff staff1[] = new Staff[2];
        Staff staff2[] = new Staff[3];

        man[0] = new Manager();
        man[0].setNama("Ujang");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].SetTunjangan(500000);
        man[0].setBagian("Administrasi");

        man[1] = new Manager();
        man[1].setNama("Dudung");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].SetTunjangan(250000);
        man[1].setBagian("Pemasaran");

        staff1[0] = new Staff();
        staff1[0].setNama("Ujang");
        staff1[0].setNip("0003");   
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000);

        staff1[1] = new Staff();
        staff1[1].setNama("Dudung");
        staff1[1].setNip("0005");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(5500);
        man[0].setStaff(staff1);

        staff2[0] = new Staff();
        staff2[0].setNama("Cecep");
        staff2[0].setNip("0004");
        staff2[0].setGolongan("3");
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(5500);

        staff2[1] = new Staff();
        staff2[1].setNama("Eneng");
        staff2[1].setNip("0006");
        staff2[1].setGolongan("4");
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(10000);

        staff2[2] = new Staff();
        staff2[2].setNama("Ucup");
        staff2[2].setNip("0007");
        staff2[2].setGolongan("3");
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(20000);
        man[1].setStaff(staff2);

        man[0].lihatInfo();
        man[1].lihatInfo();
}
}
