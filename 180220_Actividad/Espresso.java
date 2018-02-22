public class Espresso extends Ingredientes{
	double costo = 20, size = 1;
	Bebida bebida;
	String sizeS;

	public Espresso(Bebida bebida){
		this.bebida = bebida;
		this.size = bebida.getSize();
	}
	@Override
	public double cost(){
		return costo * bebida.getSize() + bebida.cost();
	}
	public String getDescripcion(){
		return bebida.getDescripcion() + " +1 shot de espresso";
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