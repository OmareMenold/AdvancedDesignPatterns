public class KelvinToCelsius {

    private KelvinTemperature kelvinTemperature;

    public KelvinToCelsius(KelvinTemperature kelvinTemperature){

        this.kelvinTemperature = kelvinTemperature;
    }
    public double kelvinToCelsius(){
        double resultsInCelsius;
        double kelvinTemp = kelvinTemperature.getKelvinTemperature();
        resultsInCelsius = (kelvinTemp - (273.15));
        return resultsInCelsius;
    }

    public double getConvertedKelvinTemp(){
        return kelvinToCelsius();
    }

}
