package mkr2;
public class Mage extends Character {
    public Mage(String name, int x, int y) {
        super("Маг", name, 100, 40, x, y);
    }
    @Override
    public void attack() {
        System.out.println(type + " " + name + " використовує магію з силою " + attackPower);
    }
    @Override
    public void displayInfo() {
        System.out.println(type + " " + name + " (Здоров'я: " + health + ", Координати: " + x + ", " + y + ")");
    }
}

