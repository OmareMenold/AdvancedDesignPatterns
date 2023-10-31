public class CelsiusTemperature {

    //    Adapter of Fahrenheit to KelvinTemperature
    private KelvinToCelsius kelvinToCelsiusTemperature;
    private KelvinTemperature kelvinTemperature;
    public CelsiusTemperature( KelvinTemperature kelvinTemperature, KelvinToCelsius kelvinToCelsiusTemperature){
        this.kelvinToCelsiusTemperature = kelvinToCelsiusTemperature;
        this.kelvinTemperature = kelvinTemperature;
    }
    public void getTemperatureStatement(){
        System.out.println("The temperature: " +kelvinTemperature.getKelvinTemperature()+ "K = " +kelvinToCelsiusTemperature.getConvertedKelvinTemp()+ "°C");
    }

}
//    T (K) = T (°C) + 273.15
//    T (°C) = T (K) - 273.15