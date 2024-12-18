package mkr2;
public abstract class Character {
    protected String type;
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x, y;
    public Character(String type, String name, int health, int attackPower, int x, int y) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = x;
        this.y = y;
    }
    public abstract void attack();
    public abstract void displayInfo();
}
