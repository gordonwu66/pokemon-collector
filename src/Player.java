/*
 * The main player and collector subclass that encounters pokemon, collects them, and interacts with other collectors
 */
public class Player extends Collector {

    public Player(String nameIn) {
        super(nameIn);
    }

    /*
     * Upon character creation, give the player a starting pokemon
     */
    public Pokemon starterPokemon() {
        return this.addPokemon(new Pokemon(131, "Glacier"));
    }
}
