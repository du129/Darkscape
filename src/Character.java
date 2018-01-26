import java.io.*;
import java.util.Scanner;

/**
 * Created by Jonathan Du on 12/25/2017.
 * Purdue CS 2019
 * du129@purdue.edu
 */
public class Character {
    static int attack = 1;
    static int defense = 1;
    static int strength = 1;
    static int constitution = 10;
    static int stamina = 100;
    static int prayer = 1;
    static int magic = 1;
    static int ranged = 1;
    static int fishing = 1;
    static int cooking = 1;
    static int summoning = 1;
    static String name;
    static int coins = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Character.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public static int getConstitution() {
        return constitution;
    }

    public static void setConstitution(int constitution) {
        Character.constitution = constitution;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getFishing() {
        return fishing;
    }

    public void setFishing(int fishing) {
        this.fishing = fishing;
    }

    public int getCooking() {
        return cooking;
    }

    public void setCooking(int cooking) {
        this.cooking = cooking;
    }

    public static int getPrayer() {
        return prayer;
    }

    public static void setPrayer(int prayer) {
        Character.prayer = prayer;
    }

    public static int getMagic() {
        return magic;
    }

    public static void setMagic(int magic) {
        Character.magic = magic;
    }

    public static int getRanged() {
        return ranged;
    }

    public static void setRanged(int ranged) {
        Character.ranged = ranged;
    }

    public static int getSummoning() {
        return summoning;
    }

    public static void setSummoning(int summoning) {
        Character.summoning = summoning;
    }

    public static int CombatLevel(int attack, int defense, int ranged, int prayer, int strength, int constitution, int summoning, int magic){
        return (int)((13/10 * Math.max(Math.max(attack + strength, 2 * magic), 2 * ranged)) + defense + constitution + Math.floor((double)prayer / 2)
                + Math.floor((double)summoning / 2)) / 4;
    }

    public static void createfile() throws IOException {
        System.out.println("What would you like to name your file(.txt)?");
        Scanner scan = new Scanner(System.in);
        String filename = scan.nextLine();
        File file = new File("/Users/jonathandu/IdeaProjects/BOOST/" + filename);
        System.out.println(file.getAbsolutePath());
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.printf("Name: %s\n", name );
        printWriter.printf("Attack: %d\n", attack);
        printWriter.printf("Defense: %d\n", defense);
        printWriter.printf("Strength: %d\n", strength);
        printWriter.printf("Constitution: %d\n", constitution);
        printWriter.printf("Magic: %d\n", magic);
        printWriter.printf("Ranged: %d\n", ranged);
        printWriter.printf("Prayer: %d\n", prayer);
        printWriter.printf("Stamina: %d\n", stamina);
        printWriter.printf("Fishing: %d\n", fishing);
        printWriter.printf("Cooking: %d\n", cooking);
        printWriter.printf("Summoning: %d\n", summoning);
        printWriter.close();
    }

    public static void readfile() throws IOException{
        System.out.println("Please enter the file to be read(.txt)?");
        Scanner scan = new Scanner(System.in);
        String filename = scan.nextLine();
        File file = new File("C:/Users/winsh/IdeaProjects/BOOST/" + filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null && !line.equals("")){
            String[] array = line.split(" ");
            String characteristic = array[0];
            switch(characteristic){
                case "Name:":
                    name = array[1];
                    break;
                case "Attack:":
                    attack = Integer.parseInt(array[1]);
                    break;
                case "Defense:":
                    defense = Integer.parseInt(array[1]);
                    break;
                case "Strength:":
                    strength = Integer.parseInt(array[1]);
                    break;
                case "Constitution:":
                    constitution = Integer.parseInt(array[1]);
                    break;
                case "Stamina:":
                    stamina = Integer.parseInt(array[1]);
                    break;
                case "Fishing:":
                    fishing = Integer.parseInt(array[1]);
                    break;
                case "Cooking:":
                    cooking = Integer.parseInt(array[1]);
                    break;
                case "Magic:":
                    magic = Integer.parseInt(array[1]);
                    break;
                case "Ranged:":
                    ranged = Integer.parseInt(array[1]);
                    break;
                case "Prayer:":
                    prayer = Integer.parseInt(array[1]);
                    break;
                case "Summoning:":
                    summoning = Integer.parseInt(array[1]);
                    break;
            }
            line = br.readLine();
        }
        //I changed that stats so hopefully the stats will be different
        System.out.printf("New name %s\n", name);
        System.out.printf("New attack %d\n", attack);
        System.out.printf("New defense %d\n", defense);
        System.out.printf("New Constitution %d\n", constitution);
        System.out.printf("New strength %d\n", strength);
        System.out.printf("New fishing %d\n", fishing);
        System.out.printf("New cooking %d\n", cooking);
        System.out.printf("New stamina %d\n", stamina);
    }
    public static void teleport(String location){
        switch (location){
            case "falador":
                //Falador falador = new Falador();
                //falador.begin();
            case "lumbridge":

        }
    }

    public static void main(String[] args) throws IOException {
        createfile();
        //readfile();
        //System.out.println(CombatLevel(25,25,25,25,25,25,1,25));
    }
}
