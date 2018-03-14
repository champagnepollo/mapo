class PizzaPlayas extends PizzaStore{
	@Override
	Pizza createPizza(String tipo){
		switch (tipo){
			case "Normal":
				pizza = new Normal();
				return pizza;
			case "DeepDish":
				pizza = new DeepDish();
				return pizza;
		}
		return null;
	}
	@Override
	Pizza agregarIngrediente(String ing){
		switch (ing){
			case "Pepperoni":
				pizza = new Pepperoni(pizza);
				return pizza;
			case "Pina":
				pizza = new Pina(pizza);
				return pizza;
		}
		return null;
	}
}