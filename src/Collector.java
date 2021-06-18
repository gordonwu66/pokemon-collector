import java.util.ArrayList;

/*
 * Superclass for the collector entities that encounter pokemon, collect them, and interact with each other
 */
public class Collector {
    private String name;
    private int lvl;

    ArrayList<Pokemon> collection;
    Pokemon main;

    /*
     * Default constructor with name
     */
    public Collector(String nameIn) {
        name = nameIn;
        lvl = 1;
        collection = new ArrayList<Pokemon>();
    }

    public Pokemon addPokemon(Pokemon p) {
        collection.add(p);
        return p;
    }

    public String listPokemon() {
        String s = "";
        s += name +"'s pokemon: ";
        for(Pokemon p : collection) {
            s += "[" +p +"] ";
        }
        return s;
    }

    public Pokemon setMain(Pokemon p) {
        main = p;
        return main;
    }

    public Pokemon getMain() {
        return main;
    }

    public String getName() {
        return name;
    }
    /*
     * Overridden toString method for listing individual collector info
     */
    public String toString() {
        return "Collector: " +name;
    }
}
