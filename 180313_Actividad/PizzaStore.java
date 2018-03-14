abstract class PizzaStore{
	Pizza pizza;
	void orderPizza(String tipo){
		pizza = createPizza(tipo);
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.empacar();
		pizza.enviar();
	}
	abstract Pizza createPizza(String tipo);
}