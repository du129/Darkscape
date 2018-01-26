public class Weapons {
    String Name;
    int damage;
    int accuracy;
    int value;
    double weight;

    public Weapons(String name, int damage, int accuracy, int value, double weight) {
        Name = name;
        this.damage = damage;
        this.accuracy = accuracy;
        this.value = value;
        this.weight = weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
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
                " Damage: "+ this.getDamage() +
                " Accuracy: "+ this.getAccuracy() +
                " Value: " + this.getValue() +
                " Weight: " + this.getWeight() + "\n");
    }
}
