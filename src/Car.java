import javax.xml.namespace.QName;

public class Car extends Toy {
    private String model;
    private String material;
    private Color color;
    private int weight;

    public Car(String name, String country, String model, String material, Color color, int weight) {
        super(name, country);
        this.model = model;
        this.material = material;
        this.color = color;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public String getMaterial() {
        return material;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.println("CAR NAME: " + getName() +
                "\nMADE IN: " + getCountry() +
                "\nMODEL: " + model +
                "\nMATERIAL: " + material +
                "\nCOLOR: " + color +
                "\nWEIGHT: " + weight + " gm");
    }
}
