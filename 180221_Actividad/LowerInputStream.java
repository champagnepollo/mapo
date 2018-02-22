import java.io.*;
public class LowerInputStream extends FilterInputStream{
	protected LowerInputStream(InputStream in){
		super(in);
	}
	@Override
	public int read() throws IOException {
	    int i = in.read(); //calling the super method read
	    if (i < 0) // if EOF, signal it 
	        return i;
	    return (Character.toLowerCase((char) i)); // otherwise, convert to char and return the lowercase
	}
}