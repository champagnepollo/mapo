import java.util.*;

public class CorreosDeMexico extends Observable{
	List<Package> pacs = new ArrayList<>();
	public int time = 100000;
	public synchronized void addPackage(Observer o, Package p) {
		p.setClient(getClientID(o));
		p.setProveedor("Correos de Mexico");
		pacs.add(p);
	}
	public void notifyObservers(){
		notifyObservers(pacs);
	}
}