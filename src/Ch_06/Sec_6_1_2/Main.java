package Ch_06.Sec_6_1_2;

public class Main {
    public static void main(String[] args) {
        Car eletricCar = new ElectricCar("BMW");
        Car petrolCar = new PetrolCar("Audi");

        System.out.println("Driving the electric car : " +
                eletricCar.getCarType() + "\n");
        eletricCar.speedUp();
        eletricCar.turnLeft();
        eletricCar.slowDown();

        System.out.println("\n\nDriving the petrol car : " +
                petrolCar.getCarType() + "\n");
        petrolCar.slowDown();
        petrolCar.turnRight();
        petrolCar.turnLeft();
    }
}
