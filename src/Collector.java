/*
 * Superclass for the collector entities that encounter pokemon, collect them, and interact with each other
 */
public class Collector {
    private String name;
    private int lvl;

    /*
     * Default constructor with name
     */
    public Collector(String nameIn) {
        name = nameIn;
        lvl = 1;
    }

    /*
     * Overridden toString method for listing individual collector info
     */
    public String toString() {
        return "Collector: " +name;
    }
}
