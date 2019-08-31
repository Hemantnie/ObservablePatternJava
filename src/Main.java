import DispalyScreens.DisplayCurrentConditions;
import DispalyScreens.DisplayForeCast;
import DispalyScreens.DisplayStatistics;

import java.io.InterruptedIOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws InterruptedIOException {

        WeatherData weatherData = new WeatherData();
        DisplayCurrentConditions displayCurrentConditions = new DisplayCurrentConditions(weatherData);
        DisplayStatistics displayStatistics = new DisplayStatistics(weatherData);
        DisplayForeCast displayForeCast = new DisplayForeCast(weatherData);

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Enter temperature: ");
            float temp = s.nextFloat();
            System.out.print("Enter humidity: ");
            float humid  = s.nextFloat();
            System.out.print("Enter pressure: ");
            float press = s.nextFloat();
            weatherData.measureMentChanged(temp,humid,press);
        }
    }
}
