import java.util.*;
class Main{
	public static void main(String[] args) {
		DHL dhl = new DHL();
		FedEx fedex = new FedEx();
		CorreosDeMexico cdm = new CorreosDeMexico();
		Package paquete = new Package();
		Package pac = new Package();
		ClienteA clienteA = new ClienteA();

		dhl.addObserver(clienteA);
		fedex.addObserver(clienteA);

		paquete.setEstado("Shipped");
		pac.setEstado("Entregado");
		dhl.addPackage(clienteA, paquete);
		fedex.addPackage(clienteA, pac);

		Timer t = new Timer();
		TimerTask ttdhl = new TimerTask(){
			@Override
			public void run(){
				dhl.setChanged();
				dhl.notifyObservers();
			}
		};
		TimerTask ttfedex = new TimerTask(){
			@Override
			public void run(){
				fedex.setChanged();
				fedex.notifyObservers();
			}
		};
		TimerTask ttcdm = new TimerTask(){
			@Override
			public void run(){
				cdm.setChanged();
				cdm.notifyObservers();
			}
		};
		t.schedule(ttdhl, 10, dhl.time);
		t.schedule(ttfedex, 10, fedex.time);
		t.schedule(ttcdm, 10, cdm.time);
	}
}