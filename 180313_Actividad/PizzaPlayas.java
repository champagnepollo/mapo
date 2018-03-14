class PizzaPlayas extends PizzaStore{
	@Override
	Pizza createPizza(String tipo){
		switch (tipo){
			case "Pepperoni":
				pizza = new Pepperoni();
				return pizza;
			case "Margherita":
				pizza = new Margherita();
				return pizza;
			case "Hawaiiana":
				pizza = new Hawaiiana();
				return pizza;
		}
		return null;
	}
}