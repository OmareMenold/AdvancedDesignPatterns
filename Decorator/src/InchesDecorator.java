public class InchesDecorator extends BaseDecorator{

    public InchesDecorator(RectangleInterface rectangleInterface) {
        super(rectangleInterface);
    }

    @Override
    public double calculateArea() {
        double area = (super.calculateArea())*39.37007874;
        System.out.println("Area in Inches: "+ area +" square inches");
        return area;

    }
}