public class Facade{
	Screen screen = new Screen();
	DVDPlayer dvd = new DVDPlayer();
	Projector projector = new Projector();
	Amplificador amp = new Amplificador();
	CDPlayer cd = new CDPlayer();

	public void playMovie(){
		screen.on();
		dvd.on();
		amp.on();
		dvd.play();
	}

	public void playCD(){
		cd.on();
		amp.on();
		cd.play();
	}

}