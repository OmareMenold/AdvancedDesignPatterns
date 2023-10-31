public class Rectangle extends Shape{
    private int length, width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    public void draw(){
        System.out.println("Generating a rectangle with: \n length = " +length +"\n width = " +width);
    }
}
