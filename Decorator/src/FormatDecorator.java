
// Concrete decorator classes for result formats
class DecimalDecorator extends BaseDecorator {
    public DecimalDecorator(RectangleInterface rectangleInterface) {
        super(rectangleInterface);
    }

    @Override
    public double calculateArea() {
        double area = super.calculateArea();
        System.out.println("Area in decimal notation(float): "+(String.format("%.2f", area))+" square meters" );
        return area;
    }
}
class ScientificNotationDecorator extends BaseDecorator {
    public ScientificNotationDecorator(RectangleInterface rectangleInterface) {
        super(rectangleInterface);
    }

    @Override
    public double calculateArea() {
        double area = super.calculateArea();
        System.out.println("Area in Scientific Notation: "+(String.format("%.2e", area)) +" square meters");
        return area;
    }
}