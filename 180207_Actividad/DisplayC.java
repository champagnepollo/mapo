import java.util.Observable;
import java.util.Observer;

public class DisplayC implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		WeatherData wd = (WeatherData)arg;
		System.out.println("Display C");
		System.out.println("Presion: " + wd.getPreasure() + "\nTemperatura: " + wd.getTemperature() + "\nHumedad: " + wd.getHumidity());
	}
}