public class NameValidate implements iField{
	public Boolean Validate(String name){
		if(name == null || name.length() < 5){
			System.out.println("Nombre no valido");
			return false;
		}
		return true;
	}
}