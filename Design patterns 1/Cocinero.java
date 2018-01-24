class Cocinero extends Persona{
	public String especialidad;
	public String puesto;

	static Cojo comp = new Cojo();
	static Persona persona = new Persona();

	public static void main(String[] args) {
		persona.asignarComp(comp);
		Cocinero linguini = new Cocinero();
		linguini.caminar();
		linguini.respirar();
		linguini.brincar();
	}
}
