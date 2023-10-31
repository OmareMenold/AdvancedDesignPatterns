abstract class BaseDecorator implements RectangleInterface {
    protected RectangleInterface rectangleInterface;

    public BaseDecorator(RectangleInterface rectangleInterface){
        this.rectangleInterface = rectangleInterface;
    }
    @Override
    public double calculateArea() {
        return rectangleInterface.calculateArea();
    }
}
