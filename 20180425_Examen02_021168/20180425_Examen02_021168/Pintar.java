import java.io.*;
public class Pintar implements Tarea{
	String tarea;
	Writer output;
	McPatito mc;

	public void done(int i){
		tarea = i + "Pintar";
		System.out.println(tarea);
		try{
			FileWriter fw =new FileWriter("log.csv",true);
	        fw.write(tarea);//appends the string to the file
    		fw.close();
    	}catch(Exception e){
    		// throw FileNotFoundException;
    	 System.out.println(e);
    	}
	}
}