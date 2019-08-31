import DispalyScreens.DisplayCurrentConditions;
import DispalyScreens.DisplayForeCast;
import DispalyScreens.DisplayStatistics;

public class WeatherData {
    private float temparature;
    private float humidity;
    private float pressure;

    public void setTemparature(float temparature) {
        this.temparature = temparature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    DisplayCurrentConditions displayCurrentConditions = new DisplayCurrentConditions();
    DisplayStatistics displayStatistics = new DisplayStatistics();
    DisplayForeCast displayForeCast = new DisplayForeCast();

    public void measureMentChanged(float t,float h,float p){
        setHumidity(h);
        setPressure(p);
        setTemparature(t);
        displayCurrentConditions.display(t,h,p);
        displayStatistics.display(t,h,p);
        displayForeCast.display(t,h,p);
    }


}
