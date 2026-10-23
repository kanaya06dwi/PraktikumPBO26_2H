package Uts;

public class TestPatrolRobot {
    public static void main(String[] args){
        Battery batt = new Battery();
        PatrolRobot pr = new PatrolRobot ("ASIMO", 2048, 150, new Battery(16000));

        pr.increasePower();

        System.out.println("Nama              : " + pr.nama);
        System.out.println("CPU Speed         : " + pr.cpuSpeed);
        System.out.println("Power             : " + pr.power);
        System.out.println("Kapasitas Baterai : " + pr.battery.capacity);
    }
}