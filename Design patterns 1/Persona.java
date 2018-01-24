class Persona{
	public String Nombre;
	private int Edad;
	private Boolean Genero;
	public static Comportamientos comp;

	public void setNombre(String Nombre){
		this.Nombre = Nombre;
	}
	
	public String getNombre(){
		return Nombre;
	}
	
	public void setEdad(int Edad){
		this.Edad = Edad;
	}
	
	public int getEdad(){
		return Edad;
	}
	
	public void setGenero(Boolean Genero){
		this.Genero = Genero;
	}
	
	public Boolean getGenero(){
		return Genero;
	}

	public void caminar(){
		comp.caminar();
	}

	// public void hablar(){
	// 	comp.hablar();
	// }

	public void respirar(){
		comp.respirar();
	}

	public void brincar(){
		comp.brincar();
	}

	public void asignarComp(Comportamientos comp){
		this.comp = comp;
	}

}
