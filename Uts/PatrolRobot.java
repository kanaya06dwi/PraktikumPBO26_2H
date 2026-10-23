package Uts;

public class PatrolRobot extends Robot {
    Battery battery;

    public PatrolRobot(String nama, int cpuSpeed, int power, Battery battery) {
        super("PATROL 09 " + nama, cpuSpeed, power);
        this.battery = battery;
    }
}