package Uts;

public class Robot {
    String nama;
    int cpuSpeed;
    int power;

    public Robot(){
    }
    public Robot(String nama, int cpuSpeed, int power) {
        this.nama = nama;
        this.cpuSpeed = cpuSpeed;
        this.power = power;
    }

    public void increasePower(int power) {
        this.power += power;
    }
    public void increasePower() {
        this.power += 20;
    }

    public void reducePower(int power) {
        this.power -= power;
    }
}
