package mkr2;
public class Warrior extends Character {
    public Warrior(String name, int x, int y) {
        super("Воїн", name, 150, 20, x, y);
    }
    @Override
    public void attack() {
        System.out.println(type + " " + name + " завдає удар мечем з силою " + attackPower);
    }
    @Override
    public void displayInfo() {
        System.out.println(type + " " + name + " (Здоров'я: " + health + ", Координати: " + x + ", " + y + ")");
    }
}

