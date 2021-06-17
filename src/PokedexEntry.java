public class PokedexEntry {

    private String name;
    private String typePrimary;
    //String typeSecondary;

    public PokedexEntry(String nameIn, String typePrimaryIn) {
        name = nameIn;
        typePrimary = typePrimaryIn;
    }

    public String getName() {
        return this.name;
    }
}
