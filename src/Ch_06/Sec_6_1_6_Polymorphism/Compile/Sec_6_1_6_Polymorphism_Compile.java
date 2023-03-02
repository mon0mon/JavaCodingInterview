package Ch_06.Sec_6_1_6_Polymorphism.Compile;

public class Sec_6_1_6_Polymorphism_Compile {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.draw();
        triangle.draw("red");
        triangle.draw(10, "blue");

        //Draw default triangle ...
        //Draw a triangle of color red
        //Draw a triangle of color blue and scale it up with the new size of 10
    }
}
