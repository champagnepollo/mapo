public class Crema extends Ingredientes{
	double costo = 5, size;
	Bebida bebida;
	String sizeS;

	public Crema(Bebida bebida){
		this.bebida = bebida;
		this.size = bebida.getSize();
	}
	@Override
	public double cost(){
		return costo * size + bebida.cost();
	}
	public String getDescripcion(){
		return bebida.getDescripcion() + " +1 paquete de crema";
	}
	public void setSize(String sizeS){
		if (sizeS == "S"){
			costo *= 0.8;
		} else if (sizeS == "L"){
			costo *= 1.2;
		}
	}
	public double getSize(){
		return size;
	}
}