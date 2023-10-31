public class Square extends Shape {
    private int side;
    public Square (int side){
        this.side = side;
    }
    @Override
    public void draw() {
        System.out.println("Generating a square whose\n  side = "+side);
    }
}
