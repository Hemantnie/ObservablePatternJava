package DispalyScreens;

import BehaviourPatternInterfaces.Observer;
import BehaviourPatternInterfaces.Subject;

public class DisplayCurrentConditions implements Observer {
    private float temparature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public DisplayCurrentConditions(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void setTemparature(float temparature) {
        this.temparature = temparature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public void updateAndDisplay(float t,float h,float p){
        setHumidity(h);
        setPressure(p);
        setTemparature(t);
        System.out.println("Temparature:"+temparature+ " Humidity:"+ humidity+" Pressure:"+pressure);
    }


}
