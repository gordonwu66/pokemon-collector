import java.util.HashMap;

public class Pokedex {

    private HashMap<Integer, PokedexEntry> dex;

    public Pokedex() {
        dex = new HashMap<Integer, PokedexEntry>();
        dex.put(131, new PokedexEntry("Lapras", "Water"));
    }

    public HashMap<Integer, PokedexEntry> getDex() {
        return this.dex;
    }

}
