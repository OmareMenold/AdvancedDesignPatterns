import java.util.Random;

public class SquareFactory implements ShapeFactory {

    @Override
    public Shape createShape(){
        Random random = new Random();
        int side = random.nextInt(100)+1;
        return new Square(side);
    }
}
