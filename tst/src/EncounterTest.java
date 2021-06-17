import org.junit.*;
import static org.junit.Assert.assertEquals;

public class EncounterTest {

    @Test
    public void genPokemonTest() {
        // Given
        Pokemon p1 = new Pokemon(131, "Glacier");

        // When
        Pokedex dex = new Pokedex();
        Encounter en = new Encounter(dex);

        // Then - assertion (test string result versus objects)
        assertEquals(p1.identify(dex), en.execute().identify(dex));
    }
}
