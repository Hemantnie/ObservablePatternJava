import java.io.InterruptedIOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedIOException {

        WeatherData weatherData = new WeatherData();
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
