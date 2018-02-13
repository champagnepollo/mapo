import java.util.Observable;
import java.util.Observer;

public class DisplayB implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		WeatherData wd = (WeatherData)arg;
		System.out.println("Display B");
		System.out.println("Temperatura: " + wd.getTemperature());
	}
}