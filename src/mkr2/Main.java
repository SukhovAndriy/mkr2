package mkr2;
public class Main {
    public static void main(String[] args) {
        ArenaMediator arena = new ArenaMediator();
        // Створюємо персонажів з іменами
        Character warrior = new Warrior("Арагорн", 5, 10);
        Character mage = new Mage("Гендальф", 7, 3);
        Character archer = new Archer("Леголас", 2, 8);
        // Додаємо їх на арену
        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);
        // Дії на арені
        System.out.println("\nКоординація атак персонажів:");
        arena.coordinateAttack();
        // Використання спостерігача
        ArenaObserver observer = new ArenaObserver("Один");
        observer.update("Воїн Арагорн починає атаку!");
        observer.update("Лучник Леголас перемістився в інші координати.");
    }
}
