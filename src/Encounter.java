/*
 * Engine for players to meet new pokemon where a pokemon is generated and the player interacts with it and the
 * environment in order to capture it through battling and using pokeballs
 */
public class Encounter {
    Pokedex dex;
    Player player;

    public Encounter(Pokedex dexIn, Player playerIn) {
        dex = dexIn;
        player = playerIn;
    }

    public void start() {
        // Generate pokemon to encounter and choose to battle or escape
        Pokemon opponent = genPokemon();

        // Loop battle step until battle terminates through capture, escape, or defeat
        Pokemon result = battle(opponent);
        if(result != null) {
            // Add captured pokemon to player's collection
            player.addPokemon(opponent);
        }
    }

    private Pokemon genPokemon() {
        // Eventually selects pokemon and its parameters based on player's level
        return new Pokemon(131, "Frost");
    }

    private Pokemon battle(Pokemon opponent) {
        int battleStatus = 0;
        Pokemon self = player.getMain();
        Battle battle = new Battle(self, opponent, dex);

        System.out.println("A wild " +opponent.identify(dex) +" appeared!");

        // Player throws out their pokemon
        System.out.println(player.getName() +" sends out " +self.identify(dex) +".");

        while(battleStatus == 0) {
            battleStatus = battle.step();
        }

        if(battleStatus == 1) {
            return opponent;
        } else {
            return null;
        }
    }

}
