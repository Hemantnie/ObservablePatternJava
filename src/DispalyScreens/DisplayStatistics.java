package DispalyScreens;

public class DisplayStatistics {
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
        if(temparature == 0 && humidity == 0 && pressure == 0){
            System.out.println("No Change in Any Parameter");
        }
        else{
            float tc = temparature - t ;
            float hc = humidity - h;
            float pc = pressure - h;
            if(tc>0) System.out.println("Temperature has decreased");
            else System.out.println("Temperature has Increased");
            if(hc>0) System.out.println("Humidity has decreased");
            else System.out.println("Humidity has Increased");
            if(pc>0) System.out.println("Pressure has decreased");
            else System.out.println("Pressure has Increased");
        }
        setHumidity(h);
        setPressure(p);
        setTemparature(t);
    }
}
