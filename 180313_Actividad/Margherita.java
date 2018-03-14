class Margherita extends Pizza{
	@Override
	void preparar(){
		System.out.println("Poniendo albahaca");
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