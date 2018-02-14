import java.util.ArrayList;
public class WeatherData implements Subject{
	private float temperature;
	private float humidity;
	private float pressure;
	private ArrayList<Observer> listWeatherObservers = new ArrayList<Observer>();

	public void register(Observer ob){
		listWeatherObservers.add(ob);
	}
	public void remove(Observer ob){
		listWeatherObservers.remove(ob);
	}
	public void notifai(){
		for(Observer observer: listWeatherObservers){
			observer.update(temperature, humidity, pressure);
		}
	}
	public void measurementsChanged(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifai();
	}
}