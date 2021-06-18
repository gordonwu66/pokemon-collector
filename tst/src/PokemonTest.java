import org.junit.*;
import static org.junit.Assert.assertEquals;

public class PokemonTest {

    @Test
    public void genPokemonTest() {
        // Given
        Pokemon p1 = new Pokemon(131, "Glacier");

        // When
        Player pl = new Player("Gordon");
        Pokedex dex = new Pokedex();
        pl.addPokemon(p1);
        pl.setMain(p1);

        // Then - assertion (test string result versus objects)
        assertEquals(p1.identify(dex), pl.getMain().identify(dex));
    }
}
