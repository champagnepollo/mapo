class Cafe extends Bebida{
	double costo = 40;
	double size = 1;
	String descripcion, sizeS;
	
	public Cafe(){

	}

	@Override
	public double cost(){
		return costo*size;
	}

	public String getDescripcion(){
		return "Cafe";
	}

	public void setSize(String sizeS){
		if (sizeS == "S"){
			size = 0.8;
		} else if (sizeS == "L"){
			size = 1.2;
		} else {
			size = 1;
		}
	}

	public double getSize(){
		return size;
	}
}