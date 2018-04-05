import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> vector = new Vector<Object>();
		vector.add(new Object());
		
		Iterator<Object> i = new Adapter<Object>(vector.elements());
	}

}