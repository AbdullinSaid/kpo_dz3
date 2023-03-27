import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GamesManager gm = new GamesManager();
        gm.registerObserver(new Developer("Said"));
        gm.registerObserver(new Journalist("Ivan"));
        gm.registerObserver(new Player("Maria"));
        ArrayList<String> dotaAchieves = new ArrayList<>();
        dotaAchieves.add("1000mmr");
        dotaAchieves.add("2000mmr");
        dotaAchieves.add("3000mmr");
        Game Dota2 = new Game("Dota 2",
                "most popular steam game",
                "rtx9090",
                dotaAchieves);

        gm.setNewestGame(Dota2);
        ArrayList<String> CsGOAchieves = new ArrayList<>();
        CsGOAchieves.add("Silver");
        CsGOAchieves.add("GoldNova");
        CsGOAchieves.add("Global Elite");
        Game CsGO = new Game("CS:GO",
                "most popular steam shooter",
                "rtx133213",
                CsGOAchieves);
        gm.setNewestGame(CsGO);
    }
}