import java.io.InputStream;
import java.util.Scanner;

// Third-party library getting temperature in Kelvin
public class KelvinTemperature {
    private double kelvinTemperature;

    public KelvinTemperature(double kelvinTemperature){
        this.kelvinTemperature = kelvinTemperature;
    }

    public double getKelvinTemperature() {
        return kelvinTemperature;
//        if (kelvinTemperature == fahrenheitTemperature.getFahrenheitTemperature()){
//            System.out.println("Temperature: "+ fahrenheitTemperature.getFahrenheitTemperature() + "F = " + fahrenheitToKelvinTemp.getTemperature() + "K" );
//            return fahrenheitToKelvinTemp.getTemperature();
//        }else {
//
//        }
    }
}
