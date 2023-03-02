package Ch_06.Sec_6_1_3_Abstraction;

public class Sec_6_1_3_Abstraction {
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

        //Driving the electric car : BMW
        //
        //Speed up the electric car
        //Turn left the electric car
        //Slow down the electric car
        //
        //
        //Driving the petrol car : Audi
        //
        //Slow down the petrol car
        //Turn right the petrol car
        //Turn left the petrol car
        //
        //Process finished with exit code 0
    }
}
