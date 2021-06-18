import java.util.Scanner;

/*
 * Battle event encapsulates the two opposing pokemon and their stats and HP, as well as the logic for all player
 * actions available during battles: attack, capture, and run
 */
public class Battle {
    Pokemon self;
    Pokemon target;
    Pokedex dex;
    int selfHp;
    int targetHp;

    public Battle(Pokemon selfIn, Pokemon targetIn, Pokedex dexIn) {
        self = selfIn;
        target = targetIn;
        dex = dexIn;
        selfHp = self.getHp();
        targetHp = target.getHp();
    }

    /*
     * Undergoes an individual step of the battle phase (can be the first turn), where player must choose an action and
     * the resulting changes are calculated, returning true when battle is concluded
     */
    public int step() {
        Scanner input = new Scanner(System.in);
        System.out.println("CHOOSE ACTION ((A)ttack or (R)un: ");
        String action = input.nextLine();
        if(action.equals("A")) {
            return calcDamage();
        } else if(action.equals("R")) {
            if(selfHp == self.getHp()) {
                System.out.println("Successfully ran away!");
                return -1;
            } else {
                System.out.println("Couldn't escape!");
            }
        } else {
            System.out.println("Invalid action, please try again.");
        }

        // Continue to another battle step
        return 0;
    }

    /*
     * Assigns damage, updates all hp, and returns result of the battle step as an integer: 1 if target faints, -1 if
     * self faints, and 0 if both pokemon still have hp and should continue battling. Should take into account different
     * moves in the future and have it passed as parameter.
     */
    public int calcDamage() {
        targetHp -= self.getAtt();
        selfHp -= target.getAtt();

        System.out.println("Player's " +self.identify(dex) +": " +selfHp +"HP");
        System.out.println("Wild " +target.identify(dex) +": " +targetHp +"HP");

        if(selfHp <= 0) {
            return -1;
        } else if(targetHp <= 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
