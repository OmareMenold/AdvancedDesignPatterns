public class Circle extends Shape{

    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Generating a circle of radius = " +radius);
    }
}
