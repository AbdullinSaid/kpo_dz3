public class Journalist implements Observer {

    private String name;

    public Journalist(String name) {
        this.name = name;
    }

    @Override
    public void update(Game newGame) {
        System.out.println("Journalist " + name + " says: newest Game's annotation: " + newGame.annotation);
    }
}
