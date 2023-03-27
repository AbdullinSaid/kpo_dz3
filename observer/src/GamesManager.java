import java.util.ArrayList;
import java.util.List;

public class GamesManager implements Observable {
    private List<Observer> observers;
    private Game newestGame;
    public GamesManager() {
        observers = new ArrayList<>();
    }

    public void setNewestGame(Game newestGame) {
        this.newestGame = newestGame;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(newestGame);
        }
    }
}
