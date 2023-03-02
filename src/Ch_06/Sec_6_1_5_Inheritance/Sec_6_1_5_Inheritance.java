package Ch_06.Sec_6_1_5_Inheritance;

public class Sec_6_1_5_Inheritance {
    public static void main(String[] args) {
        Programmer p = new Programmer("Joana Nimar", "Toronto");

        String name = p.getName();
        String team = p.getTeam();

        System.out.println(name + " is assigned to the " + team + " team");
        //Joana Nimar is assigned to the Toronto team
    }
}
