/*
 * Engine for players to meet new pokemon where a pokemon is generated and the player interacts with it and the
 * environment in order to capture it through battling and using pokeballs
 */
public class Encounter {
    Pokedex dex;

    public Encounter(Pokedex dexIn) {
        dex = dexIn;
    }

    public Pokemon execute() {
        // Generate pokemon to encounter and choose to battle or escape
        Pokemon opponent = genPokemon();

        // Loop battle step until battle terminates through capture, escape, or defeat
        return battle(opponent);
    }

    private Pokemon genPokemon() {
        // Eventually selects pokemon and its parameters based on player's level
        return new Pokemon(131, "Glacier");
    }

    /*
     * A single turn in the battle sequence where the player attacks with their pokemon, throws a pokeball to capture,
     * or runs away. The step and battle end through a defeat of either pokemon, escape, or successful capture.
     */
    private boolean battleStep() {
        return true;
    }

    private Pokemon battle(Pokemon opponent) {
        boolean encounterFinished = false;

        // Player throws out their pokemon

        while(!encounterFinished) {
            encounterFinished = battleStep();
        }

        return opponent;
    }

}
