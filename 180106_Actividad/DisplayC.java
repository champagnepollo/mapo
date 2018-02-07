class DisplayC implements Observer, Display{
	float temp;
	float hum;
	float pre;

	public void update(float temp, float hum, float pre){
		this.temp = temp;
		this.hum = hum;
		this.pre = pre;
		System.out.println("Display C actualizado");
	}
	public void display(){
		System.out.format("Temperatura: %f \nHumedad: %f \nPresion: %f", temp, hum, pre);
	}
}