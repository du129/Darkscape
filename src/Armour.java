public class Armour extends Items{
    String name;
    int armour;
    int value;
    double weight;

    public Armour(String name, int armour, int value, double weight) {
        this.name = name;
        this.armour = armour;
        this.value = value;
        this.weight = weight;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("Name: "+this.getName()+
                " Armour: "+ this.getArmour() +
                " Value: " + this.getValue() +
                " Weight: " + this.getWeight() + "\n");
    }
}
