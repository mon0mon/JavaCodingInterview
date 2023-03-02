package Ch_06.Sec_6_1_6_Polymorphism.Runtime;

public class Sec_6_1_6_Polymorphism_Runtime {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        triangle.draw();
        rectangle.draw();
        circle.draw();

        //Draw a triangle ...
        //Draw a rectangle ...
        //Draw a circle ...
    }
}
