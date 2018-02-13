import java.util.*;

public class WeatherData extends Observable{
    private float preasure;
    private float humidity;
    private float temperature;

    public void readMeasurements(){
        setChanged();
        notifyObservers(this);
    }
    public float getPreasure(){
        return this.preasure;
    }
    public void setPreasure(float preasure){
        this.preasure = preasure;
        this.readMeasurements();
    }
    public float getHumidity(){
        return this.humidity;
    }
    public void setHumidity(float humidity){
        this.humidity = humidity;
        this.readMeasurements();
    }
    public float getTemperature(){
        return this.temperature;
    }
    public void setTemperature(float temperature){
        this.temperature = temperature;
        this.readMeasurements();
    }
}