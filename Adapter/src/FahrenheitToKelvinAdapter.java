// Third-party library converting temperature in Kelvin
public class FahrenheitToKelvinAdapter {

    //compatible with Celsius
    private FahrenheitTemperature fahrenheitTemperature;
    public FahrenheitToKelvinAdapter(FahrenheitTemperature fahrenheitTemperature){
        this.fahrenheitTemperature = fahrenheitTemperature;
    }
    public double getConvertedFahrenheitTemp(){
        double resultInKelvin;
        double fahTemperature= fahrenheitTemperature.getFahrenheitTemperature();
        resultInKelvin = ((fahTemperature+459.67)*((double) 5 /9));
        return resultInKelvin;
    }
    public void getTemperatureStatement(){
        System.out.println("The temperature: " +fahrenheitTemperature.getFahrenheitTemperature()+ "F = " +getConvertedFahrenheitTemp()+ "K");
    }
}
//        T(K) = (T(°F) + 459.67)× 5/9
//        T(°F) = (T(K)*5/9)-459.67
//        T(°C) = (T(°F) - 32) × 5/9
//        T(K) = T(°C) + 273.15
