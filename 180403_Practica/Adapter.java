import java.util.Enumeration;
import java.util.Iterator;

public class Adapter<T> implements Iterator<T>{
	Enumeration<T> e;
	
	public Adapter(Enumeration<T> e) {
		this.e = e;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return e.hasMoreElements();
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return e.nextElement();
	}

}