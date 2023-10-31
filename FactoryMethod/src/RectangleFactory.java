import java.util.Random;

public class RectangleFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        Random random = new Random();
        int width = random.nextInt(100)+1;
        int length = random.nextInt(100)+1;
        return new Rectangle(width, length);
    }
}
