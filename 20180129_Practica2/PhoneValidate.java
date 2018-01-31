public class PhoneValidate implements iField{
	public Boolean Validate(String phone){
		String regexStr = "^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$";

		if (phone.matches(regexStr)){
			return true;
		}
		
		System.out.println("Teléfono no valido");
		return false;
	}
}