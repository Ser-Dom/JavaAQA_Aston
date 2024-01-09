package figure;

public class MainFigure {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red", "Black");
        Rectangle rectangle = new Rectangle(4, 6, "Green", "Blue");
        Triangle triangle = new Triangle(3, 4, 5, "Yellow", "Orange");

        circle.printCharacteristics();
        rectangle.printCharacteristics();
        triangle.printCharacteristics();
    }
}
