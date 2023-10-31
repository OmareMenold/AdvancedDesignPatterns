import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Enter the length and width of the rectangle given (Measurements in meters only)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter value of width: ");
        double width = scanner.nextDouble();

        // Create the base component
        RectangleInterface rectangle = new Rectangle(length, width);
        // Apply decorators
        BaseDecorator cmDecorator, sciNotDecorator, decimalDecorator, inchesDecorator;
        inchesDecorator = new InchesDecorator(rectangle);
        decimalDecorator = new DecimalDecorator(rectangle);
        sciNotDecorator =  new ScientificNotationDecorator(rectangle);
        cmDecorator = new CentimeterDecorator(rectangle);
        // Calculate and display the area

        System.out.println(cmDecorator.calculateArea() + "\n" + inchesDecorator.calculateArea() +
                "\n" + sciNotDecorator.calculateArea() + "\n" + decimalDecorator.calculateArea());
    }
}