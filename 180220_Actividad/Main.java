class Main{
	public static void main(String[] args) {
		Bebida cafeTaco = new Cafe();
		cafeTaco.setSize("S"); //El tamaño se le debe dar desde que se define la bebida
		cafeTaco = new Espresso(cafeTaco);
		cafeTaco = new Crema(cafeTaco);

		System.out.println(cafeTaco.cost());
	}
}