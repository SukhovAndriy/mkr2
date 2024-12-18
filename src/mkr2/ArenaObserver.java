package mkr2;
public class ArenaObserver implements Observer {
    private String name;

    public ArenaObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println("Спостерігач " + name + ": " + message);
    }
}

