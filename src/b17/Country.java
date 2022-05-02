package b17;

public class Country {

    private String countryName;
    private Game[] games; //size 43

    public Country(String countryName) {
        this.countryName = countryName;
        games = new Game[43];
    }

    public boolean participates(String gameName) {
        for (int i = 0; i < games.length; i++) {
            if (games[i].getGameName().equals(gameName))
                return true;
        }
        return false;
    }
}
