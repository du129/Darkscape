import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Character character = new Character();
        character.setName(name);
        System.out.printf("Welcome %s to DarkScape\n", name);
        System.out.println("Where would you like to go?");
        System.out.println("1. Falador\n2. Varrock\n3. Edgeville\n4. Lumbridge\n5. Grand Exchange\n");
        int num = scan.nextInt();
        switch (num){
            case 1:
                character.teleport("falador");
                return;
            case 2:
                character.teleport("varrock");
                return;
            case 3:
                character.teleport("edgeville");
                return;
            case 4:
                character.teleport("lumbridge");
                return;
            case 5:
                character.teleport("grandexchange");
                return;
        }
    }
}
