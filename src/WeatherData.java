import BehaviourPatternInterfaces.Subject;
import BehaviourPatternInterfaces.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class WeatherData implements Subject {
    private float temparature;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observerList;

    public WeatherData(){
        observerList = new ArrayList<>();
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

    public void measureMentChanged(float t,float h,float p){
        setHumidity(h);
        setPressure(p);
        setTemparature(t);
        notifyObserver();
    }


    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        Iterator<Observer> listIterator = observerList.iterator();
        while(listIterator.hasNext()){
            listIterator.next().updateAndDisplay(temparature,humidity,pressure);
        }
    }
}
