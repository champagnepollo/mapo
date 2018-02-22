abstract class Bebida{
	String descripcion, sizeS;
	double costo;

	public Bebida(){
		
	}

	public abstract double cost();

	public abstract String getDescripcion();

	public abstract void setSize(String sizeS);

	public abstract double getSize();
}