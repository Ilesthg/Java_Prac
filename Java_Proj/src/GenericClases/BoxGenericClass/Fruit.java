package Java_Proj.src.GenericClases.BoxGenericClass;

public class Fruit implements Boxable {
    private final String name;
    private final String countryOfOrigin;
    private final String colour;
    private final double weight;

    public Fruit(String name, String countryOfOrigin, String colour, double weight) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.colour = colour;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit [name=" + name + ", countryOfOrigin=" + countryOfOrigin + ", colour=" + colour + ", weight="
                + weight + "]";
    }
}
