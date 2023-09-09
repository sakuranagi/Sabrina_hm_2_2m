public class Animal extends Toy{
    private String animalType;
    private String character;
    private String powerSupply;

    public Animal(String name, String country, String animalType, String character, String powerSupply) {
        super(name, country);
        this.animalType = animalType;
        this.character = character;
        this.powerSupply = powerSupply;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getCharacter() {
        return character;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    @Override
    public void print() {
        System.out.println("ANIMAL NAME: " + getName() +
                "\nMADE IN: " + getCountry() +
                "\nANIMAL TYPE: " + animalType +
                "\nCHARACTER FROM: " + character +
                "\nPOWER SUPPLY: " + powerSupply);
    }
}
