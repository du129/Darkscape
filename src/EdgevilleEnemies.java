import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Jonathan Du on 12/27/2017.
 * Purdue CS 2019
 * du129@purdue.edu
 */
public class EdgevilleEnemies {
    static String name;
    private static int attack;
    private static int defense;
    private static int strength;
    private static int constitution;
    private static int prayer;
    private static int magic;
    private static int ranged;
    private static int summoning;
    static String weakness;
    static int max = 40;
    static int min = 21;

    static String[] names = new String[]{"Hobogoblin", "Mugger", "Unicorn", "Hill Giant", "Poison Spider", "Giant Spider", "Hound", "James Ghera"};
    public static void generateEnemies(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, names.length);
        name = names[randomNum];
        attack = ThreadLocalRandom.current().nextInt(min, max + 1);
        defense = ThreadLocalRandom.current().nextInt(min, max + 1);
        strength = ThreadLocalRandom.current().nextInt(min, max + 1);
        constitution = ThreadLocalRandom.current().nextInt(max, max + 10 + 1);
        prayer = ThreadLocalRandom.current().nextInt(min, max + 1);
        magic = ThreadLocalRandom.current().nextInt(min, max + 1);
        ranged = ThreadLocalRandom.current().nextInt(min, max + 1);
        summoning = ThreadLocalRandom.current().nextInt(min, max + 1);

        System.out.printf("New name %s\n", name);
        System.out.printf("New attack %d\n", attack);
        System.out.printf("New defense %d\n", defense);
        System.out.printf("New Constitution %d\n", constitution);
        System.out.printf("New strength %d\n", strength);
        System.out.println(CombatLevel(attack,defense,ranged,prayer,strength, constitution,summoning, magic));
    }
    public static int CombatLevel(int attack, int defense, int ranged, int prayer, int strength, int constitution, int summoning, int magic){
        return (int)((13/10 * Math.max(Math.max(attack + strength, 2 * magic), 2 * ranged)) + defense + constitution + Math.floor((double)prayer / 2)
                + Math.floor((double)summoning / 2)) / 4;
    }
    public static void main(String[] args) {
        generateEnemies();
    }
}
