public class PasswordValidate implements iField{
	public Boolean Validate(String password){
		if(password == null || password.length() < 6){
			System.out.println("Nombre no valido");
			return false;
		}
		return true;
	}
}