package DispalyScreens;

public class DisplayCurrentConditions {
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

    public void display(float t,float h,float p){
        setHumidity(h);
        setPressure(p);
        setTemparature(t);
        System.out.println("Temparature:"+temparature+ " Humidity:"+ humidity+" Pressure:"+pressure);
    }


}
