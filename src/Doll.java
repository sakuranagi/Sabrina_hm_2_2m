public class Doll extends Toy {
    private String gender;
    private int height;
    private String features;

    public Doll(String name, String country, String gender, int height, String features) {
        super(name, country);
        this.gender = gender;
        this.height = height;
        this.features = features;
    }

    public String getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public String getFeatures() {
        return features;
    }

    @Override
    public void print() {
        System.out.println("DOLL NAME: " + getName() +
                "\nMADE IN: " + getCountry() +
                "\nGENDER: " + gender +
                "\nHEIGHT: " + height + " cm" +
                "\nFEATURES: " + features);
    }
}
