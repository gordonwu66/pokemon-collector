/*
 * Main Pokemon entities to encapsulate different stats and be encountered/collected
 */
public class Pokemon {
    // From 1 to 100 and used to calculate other stats
    private int lvl;
    // From 1 to 100 and used for encounter appearances and catch difficulty
    private int rarity;
    private int dexId;
    private String nickname;

    // Combat stats
    private int hp;
    private int att;
    //private int def;
    //private int spe;


    public Pokemon(int dexIdIn, String nicknameIn) {
        dexId = dexIdIn;
        nickname = nicknameIn;
        lvl = 1;
        rarity = 1;

        // Calculate combat stats based on level
        hp = 10;
        att = 1;
    }

    public int getHp() {
        return hp;
    }

    public int getAtt() {
        return att;
    }

    /*
     * Display info and stats of individual pokemon using player's pokedex
     */
    public String identify(Pokedex dex) {
        return dex.getDex().get(dexId).getName();

    }

    public String toString() {
        return "Pokemon: " +dexId +", " +nickname;
    }

}
