class Test{
	public static void main(String[] args) {
		float temperature = 14;
		float humidity = 35;
		float pressure = 101;

		Subject wd = new WeatherData();
		DisplayA a = new DisplayA();
		DisplayB b = new DisplayB();
		DisplayC c = new DisplayC();

		wd.register(a);
		wd.register(b);
		wd.register(c);

		wd.remove(b);
		wd.measurementsChanged(temperature, humidity, pressure);
		c.display();
	}
}