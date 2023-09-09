public abstract class Toy implements Printable{
    private String name;
    private String country;

    public Toy(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}
