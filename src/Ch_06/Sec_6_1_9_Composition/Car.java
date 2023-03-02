package Ch_06.Sec_6_1_9_Composition;

public class Car {
    private final String name;
    private final Engine engine;

    public Car(String name) {
        this.name = name;

        Engine engine = new Engine("petrol", 300);
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public int getHorsepower() {
        return this.engine.getHorsepower();
    }
}
