abstract class PizzaStore{
	Pizza pizza;
	// Ingrediente ingrediente;
	void orderPizza(){
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.empacar();
		pizza.enviar();
	}
	abstract Pizza createPizza(String tipo);
	abstract Pizza agregarIngrediente(String ing);
}