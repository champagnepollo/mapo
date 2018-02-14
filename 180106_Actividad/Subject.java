public interface Subject{
	public void register(Observer ob);
	public void remove(Observer ob);
	public void notifai();
	public void measurementsChanged(float temperature, float humidity, float pressure);
}