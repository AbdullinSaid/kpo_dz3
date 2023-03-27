public class Developer implements Observer {

    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void update(Game newGame) {
        System.out.println("Developer " + name + " says: newest Game's characteristics: " + newGame.characteristics);
    }
}
