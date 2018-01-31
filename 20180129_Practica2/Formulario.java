import java.util.Scanner;

class Formulario{
	
	Field[] fields = new Field[5];

	public void register(){
		Scanner s = new Scanner(System.in);
		fields[0] = new Email();
		fields[1] = new Name();
		fields[2] = new Phone();
		fields[3] = new Password();
		fields[4] = new Genre();

		for(Field field : fields){
			field.setField(s.nextLine());
		}		
		s.close();
	}
	public Boolean save(){
		for(Field field : fields){
			if(!field.save()){
				return false;
			}
		}
		return true;
	}

}