package Jobsheet6;

public class Inheritance1 {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("Naya", "Malang", "perempuan", 19, 1000000, 0, 0, "A", 50000);
        ST.tampilStaffTetap();

        StaffHarian SH = new StaffHarian("Budi", "Surabaya", "laki-laki", 20, 1500000, 0, 0, 20);
        SH.tampilStaffHarian();
    }
}
