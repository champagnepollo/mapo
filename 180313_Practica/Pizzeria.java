class Pizzeria{
	public static void main(String[] args) {
		PizzaStore PS = new PizzaPlayas();
		PS.createPizza("Normal");
		PS.agregarIngrediente("Pepperoni");
		PS.orderPizza();
	}
}