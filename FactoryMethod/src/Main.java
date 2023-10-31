
//Task: Create a program that generates random shapes (e.g. circles and rectangles).
// Implement the Factory Method pattern to encapsulate the creation of each shape in a separate class,
// and allow users to specify the type of shape they want to generate at runtime.
// Use console output to display the properties of each generated shape.




import java.util.Random;
import java.util.Scanner;

public class Main {
    public static  void generateShape(ShapeFactory factory){
        Shape shape = factory.createShape();
        shape.draw();
    }
    public static void main(String[] args) {


        System.out.println("Hello. What shape would you like to be generated: \n" +
                "1. Square \n" +
                "2. Rectangle");

        Scanner inputChoice = new Scanner(System.in);
        System.out.println("Choice: "); int shapeChoice = inputChoice.nextInt();

        switch (shapeChoice){
            case 1:
                ShapeFactory factory1 = new SquareFactory();
                generateShape(factory1);
                break;
            case 2:
                ShapeFactory factory2 = new RectangleFactory();
                generateShape(factory2);
                break;
            default:
                System.out.println("Enter a number to select your shape");
        }



        // ShapeFactory[] factories = {new SquareFactory(), new RectangleFactory()};
        // ShapeFactory[] factories = {new SquareFactory(), new RectangleFactory()};

    }
}