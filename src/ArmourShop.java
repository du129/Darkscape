import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArmourShop {
    String type; //type of shop will determine what items the shop will sell
    // this should be chosen from an array which along with the location will determine what items will be soll
    int items; //number of items in the shop
    List<Armour> armourList = new ArrayList<Armour>();

    public ArmourShop(String type) {
        String file = "";
        if (type.equals("armour")){
            file = "ArmourTextFile.txt";
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                String[] stats = line.split("  ");
                Armour armour = new Armour(stats[0],Integer.parseInt(stats[1]),Integer.parseInt(stats[2]),Double.parseDouble(stats[3]));
                armourList.add(armour);
            }
            System.out.println(armourList.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new ArmourShop("armour");
    }
}
