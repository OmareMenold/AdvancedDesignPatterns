//Task: Create a program that converts temperatures from Fahrenheit to Celsius.
// Implement the Adapter pattern to adapt a third-party library that provides temperature conversion in Kelvin,
// and use the adapted library to perform the conversion. Use console output to display the converted temperatures.


import java.util.Scanner;

public class Main {
    private static FahrenheitTemperature fahrenheitTemperature;

    public static void main(String[] args) {


        //                The temperature: 245.0F = 391.4833333333334K
        //                The temperature: 391.4833333333334K = 118.33333333333343°C


        System.out.println("What operation do you want to perform:(use 1 or 2 to select) \n1. Fahrenheit to Celsius\n2. Kelvin to Celsius");
        Scanner inputOption = new Scanner(System.in);
        System.out.println("Enter choose: _____ ");
        int choose = inputOption.nextInt();
        switch (choose) {
            case 1:
                double getKelvinFromFah = kelvinFromFahrenheit();
                KelvinTemperature kelvinTemperature1 = new KelvinTemperature(getKelvinFromFah);
                KelvinToCelsius kelvinToCelsius1 = new KelvinToCelsius(kelvinTemperature1);
                CelsiusTemperature temp1 = new CelsiusTemperature(kelvinTemperature1, kelvinToCelsius1);
                temp1.getTemperatureStatement();
                break;
            case 2:
                Scanner scannerK = new Scanner(System.in);
                System.out.println("Enter the Kelvin temperature value: ___");
                double inputKelvinTemp = scannerK.nextDouble();
                KelvinTemperature kelvinTemperature = new KelvinTemperature(inputKelvinTemp);
                KelvinToCelsius kelvinToCelsius = new KelvinToCelsius(kelvinTemperature);
                CelsiusTemperature temp = new CelsiusTemperature(kelvinTemperature, kelvinToCelsius);
                temp.getTemperatureStatement();
                break;
            default:
                System.out.println("Enter a valid option next time");
        }


//        FahrenheitTemperature fahrenheitTemperature = new FahrenheitTemperature(30);
//        FahrenheitToKelvinAdapter fahrenheitToKelvin = new FahrenheitToKelvinAdapter(fahrenheitTemperature);
//        fahrenheitToKelvin.getTemperature();

    }
    public static double kelvinFromFahrenheit(){
        Scanner scannerF = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit(°F) temperature value: ___");
        double inputFahrenheitTemp = scannerF.nextDouble();
        FahrenheitTemperature fahrenheitTemperature = new FahrenheitTemperature(inputFahrenheitTemp);
        FahrenheitToKelvinAdapter fahrenheitToKelvinAdapter = new FahrenheitToKelvinAdapter(fahrenheitTemperature);
        fahrenheitToKelvinAdapter.getTemperatureStatement();
        double results = fahrenheitToKelvinAdapter.getConvertedFahrenheitTemp();
        return results;

    }
}

