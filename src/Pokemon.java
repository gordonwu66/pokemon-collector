/*
 * Main Pokemon entities to encapsulate different stats and be encountered/collected
 */
public class Pokemon {
    private int lvl;
    private int rarity;
    private int dexId;
    private String nickname;

    public Pokemon(int dexIdIn, String nicknameIn) {
        dexId = dexIdIn;
        nickname = nicknameIn;
        lvl = 1;
        rarity = 1;
    }

    /*
     * Display info and stats of individual pokemon using player's pokedex
     */
    public String identify(Pokedex dex) {
        return "Pokemon: " +dex.getDex().get(dexId).getName();

    }

    public String toString() {
        return "Pokemon: " +dexId +", " +nickname;
    }

}
