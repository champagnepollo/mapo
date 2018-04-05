public class Client{
	public static void main(String[] args) {
		Facade facade = new Facade();
		
		facade.playMovie();

		facade.playCD();
	}
}