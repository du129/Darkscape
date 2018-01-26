import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeaponsShop {
    String type; //type of shop will determine what items the shop will sell
    // this should be chosen from an array which along with the location will determine what items will be soll
    int items; //number of items in the shop
    List<Weapons> weaponsList = new ArrayList<Weapons>();

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
    public static void main(String[] args) {
        new WeaponsShop("weapon");
    }
}
