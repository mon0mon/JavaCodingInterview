package Ch_06.Sec_6_1_4_Encapsulation;

public class Sec_6_1_4_Encapsulation {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.feed();
        cat.play();
        cat.feed();
        cat.sleep();

        System.out.println("Energy : " + cat.getEnergy());
        System.out.println("Mood : " + cat.getMood());
        System.out.println("Hungry : " + cat.getHungry());

        //Feed ...
        //Meow!
        //Play ...
        //Meow!
        //Feed ...
        //Meow!
        //Sleep ...
        //Energy : 50
        //Mood : 53
        //Hungry : 49
    }
}
