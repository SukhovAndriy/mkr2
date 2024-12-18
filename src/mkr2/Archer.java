package mkr2;
public class Archer extends Character {
    public Archer(String name, int x, int y) {
        super("Лучник", name, 120, 30, x, y);
    }
    @Override
    public void attack() {
        System.out.println(type + " " + name + " стріляє з лука з силою " + attackPower);
    }
    @Override
    public void displayInfo() {
        System.out.println(type + " " + name + " (Здоров'я: " + health + ", Координати: " + x + ", " + y + ")");
    }
}

