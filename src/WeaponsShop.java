import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class WeaponsShop {
    //this shop will have an unlimited number of items

    String type; //type of shop will determine what items the shop will sell
    // this should be chosen from an array which along with the location will determine what items will be soll
    //int items; //number of items in the shop
    List<Weapons> weaponsList = new ArrayList<Weapons>();

    Character character = new Character();
    public WeaponsShop(String type) {
        String file = "";
        if (type.equals("weapon")){
            file = "WeaponsTextFile.txt";
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                String[] stats = line.split("  ");
                Weapons weapon = new Weapons(stats[0],Integer.parseInt(stats[1]),Integer.parseInt(stats[2]),Integer.parseInt(stats[3]),Double.parseDouble(stats[4]));
                weaponsList.add(weapon);
            }
            System.out.println(weaponsList.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //I would like to design this feature around the User
    public void sell(Weapons weapon){
        int coins = character.getCoins();
        if (weaponsList.contains(weapon)){
            if(coins > weaponsList.get(weaponsList.indexOf(weapon)).getValue()){
                character.backpack.add(weapon);
                character.setCoins(coins - weaponsList.get(weaponsList.indexOf(weapon)).getValue());
            }else{
                System.out.println("You do not have enough money to purchase this item");
            }
        }else{
            System.out.println("The item you requested is not listed");
        }
    }
    public static void main(String[] args) {
        new WeaponsShop("weapon");
    }
}
