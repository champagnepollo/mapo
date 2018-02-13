import java.util.*;

public class Test{
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Observer displayA = new DisplayA();
        Observer displayB = new DisplayB();
        Observer displayC = new DisplayC();

        wd.addObserver(displayA);
        wd.addObserver(displayB);
        wd.addObserver(displayC);

        wd.setTemperature(14);
        wd.setHumidity(50);
        wd.setPreasure(111);
        
        wd.deleteObserver(displayA);

        System.out.println("");

        wd.setPreasure(100);
    }
}