import java.util.*;

public class ClienteA implements Observer{
	List<Package> p;
	@Override
	public void update(List arg) {
		p = arg;
		System.out.println("Cliente A");
		for (Package pac: p) {
			if(pac.getClient() == 0){}
			System.out.println("Proveedor: " + pac.getProveedor() + " Estado: " + pac.getEstado());
		}
	}
}