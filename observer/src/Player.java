public class Player implements Observer {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update(Game newGame) {
        System.out.println("Player " + name + " says: " + newGame.name + " has achieves:");
        for (String achieve : newGame.achieves) {
            System.out.println(achieve);
        }
    }
}
