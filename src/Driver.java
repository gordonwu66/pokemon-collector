/*
 * Driver file for the (currently) command-line program
 */
public class Driver {

    public static void main(String[] args) {
        System.out.println("Starting program: ");

        Collector c1 = new Collector("Red");
        System.out.println(c1);

        Pokedex dex = new Pokedex();
        Pokemon p1 = new Pokemon(131, "Glacier");
        System.out.println(p1.identify(dex));

        Player pl = new Player("Gordon");
        pl.starterPokemon();
        pl.addPokemon(new Pokemon(131, "Tundra"));
        System.out.println(pl.listPokemon());

        Encounter en = new Encounter(dex, pl);
        en.start();

        System.out.println(pl.listPokemon());

        System.out.println("Ending program.");

    }
}
