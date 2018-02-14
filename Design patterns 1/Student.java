class Student extends Persona{
	public int matricula;
	public String carrera;

	static Normal comp = new Normal();
	static Persona persona = new Persona();

	public static void main(String[] args) {
		persona.asignarComp(comp);
		Student paco = new Student();
		paco.caminar();
	}
}
