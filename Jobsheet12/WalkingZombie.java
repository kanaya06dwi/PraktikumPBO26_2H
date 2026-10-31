package Jobsheet12;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (int) (health * 0.10);
                break;
            case 2:
                health += (int) (health * 0.30);
                break;
            case 3:
                health += (int) (health * 0.40);
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (int) (health * 0.20);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\n" + super.getZombieInfo();
    }
}
