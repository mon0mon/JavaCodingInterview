package Ch_06.Sec_6_1_7_Association;

public class Sec_6_1_7_Association {
    public static void main(String[] args) {
        Person p1 = new Person("Andrei");
        Person p2 = new Person("Marin");
        Address a1 = new Address("Banesti", "107050");
        Address a2 = new Address("Bucuresti", "229344");

        System.out.println(p1.getName() + " lives at address "
        + a2.getCity() + ", " + a2.getZip()
        + " but is also has an address at "
        + a1.getCity() + ", " + a1.getZip());
        System.out.println(p2.getName() + " lives at address "
        + a1.getCity() + ", " + a1.getZip()
        + " but is also has an address at "
        + a2.getCity() + ", " + a2.getZip());

        //Andrei lives at address Bucuresti, 229344 but is also has an address at Banesti, 107050
        //Marin lives at address Banesti, 107050 but is also has an address at Bucuresti, 229344
    }
}
