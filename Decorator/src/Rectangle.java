public class Rectangle implements RectangleInterface{

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double area = length*width;
        return area;
    }
}
