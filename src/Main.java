public class Main {
    public static void main(String[] args) {
        Printable car = createObject("Car");
        Printable doll = createObject("Doll");
        Printable animal = createObject("Animal");
        Printable[] printables = {car, doll, animal};

        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
            System.out.println("---------------------");
        }
    }
    public static Printable createObject(String className) {
        switch (className) {
            case "Car":
                return new Car("Makwin", "America", "Chevrolet Corvette",
                        "Plastic", Color.RED, 250);
            case "Doll":
                return new Doll("Barbie", "USA", "Female",
                        25, "Combable, Can talk");
            case "Animal":
                return new Animal("Spirit", "USA", "Horse",
                        "Spirit movie", "No");
        }
        return null;
    }
}