import java.util.*;

public class FedEx extends Observable{
	List<Package> pacs = new ArrayList<>();
	public int time = 10000;
	public synchronized void addPackage(Observer o, Package p) {
		p.setClient(getClientID(o));
		p.setProveedor("FedEx");
		pacs.add(p);
	}
	public void notifyObservers(){
		notifyObservers(pacs);
	}
}