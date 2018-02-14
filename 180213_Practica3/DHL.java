import java.util.*;

public class DHL extends Observable{
	List<Package> pacs = new ArrayList<>();
	public int time = 5000;
	public synchronized void addPackage(Observer o, Package p) {
		p.setClient(getClientID(o));
		p.setProveedor("DHL");
		pacs.add(p);
	}
	public void notifyObservers(){
		notifyObservers(pacs);
	}
}