class DisplayB implements Observer{
	float temp = 0;
	float hum = 0;

	public void update(float temp, float hum, float pre){
		this.temp = temp;
		this.hum = hum;
		System.out.println("Display B actualizado");
	}
}