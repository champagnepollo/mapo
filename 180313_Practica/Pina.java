class Pina extends Ingredientes{
	Pizza pizza;
	public Pina(Pizza pizza){
		this.pizza = pizza;
	}
	@Override
	void preparar(){
		System.out.println("Agredando piña");
	}
	@Override
	void hornear(){
		System.out.println("Horneando");
	}
	@Override
	void cortar(){
		System.out.println("Cortando");
	}
	@Override
	void empacar(){
		System.out.println("Empacando");
	}
	@Override
	void enviar(){
		System.out.println("Enviando");
	}
}