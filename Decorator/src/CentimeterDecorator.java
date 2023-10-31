public class CentimeterDecorator extends BaseDecorator {
    public CentimeterDecorator(RectangleInterface rectangleInterface) {
        super(rectangleInterface);
    }

    ;

    @Override
    public double calculateArea() {
        double area = super.calculateArea() * 100;
        System.out.println("Area in centimeters: " + Math.round(area) + " square cm");
        return Math.round(area);
    }
}
