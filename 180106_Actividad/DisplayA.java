class DisplayA implements Observer{
	float temp = 0;

	public void update(float temp, float hum, float pre){
		this.temp = temp;
		System.out.println("Display A actualizado");
	}
}