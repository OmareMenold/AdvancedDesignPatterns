import java.util.Scanner;

public class FahrenheitTemperature {

    //Not compatible with Celsius but must be integrated to the program
    private double fahrenheitTemperature;
    public FahrenheitTemperature(double fahrenheitTemperature){
        Scanner scanner = new Scanner(System.in);
        fahrenheitTemperature = scanner.nextDouble();
        this.fahrenheitTemperature = fahrenheitTemperature;
    }
    public double getFahrenheitTemperature() {
        return fahrenheitTemperature;
    }
}
