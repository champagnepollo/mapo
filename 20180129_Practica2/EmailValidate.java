public class EmailValidate implements iField{
	@Override
	public Boolean Validate(String email){
		email = email.trim();

	    if(email == null || email.equals("")){
	    	System.out.println("Email no valido");
	        return false;}

	    if(email.matches("[a-zA-Z]*")){
	    	System.out.println("Email no valido");
	        return false;}
	    
	    if(!email.contains("@")){
	    	System.out.println("Email no valido");
	    	return false;}
	    
	    return true;
	}
}