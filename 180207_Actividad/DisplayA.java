import java.util.Observable;
import java.util.Observer;

public class DisplayA implements Observer{
	@Override
	public void update(Observable o, Object arg) {
	WeatherData wd = (WeatherData)arg;
		System.out.println("Display A");
		System.out.println("Presion: " + wd.getPreasure());
	}
}