package DispalyScreens;

public class DisplayForeCast {

    private float temparature;
    private float humidity;
    private float pressure;

    public void setTemparature(float temperature) {
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
            System.out.println("Not a good time to predict");
        }
        else{
            float tc = temparature - t ;
            float hc = humidity - h;
            float pc = pressure - h;
            if(tc>0) System.out.println("upcoming Temperature may decreased");
            else System.out.println("upcoming Temperature may Increased");
            if(hc>0) System.out.println("upcoming Humidity may decreased");
            else System.out.println("upcoming Humidity may Increased");
            if(pc>0) System.out.println("upcoming Pressure may decreased");
            else System.out.println("upcoming Pressure may Increased");
        }
        setHumidity(h);
        setPressure(p);
        setTemparature(t);
    }
}
