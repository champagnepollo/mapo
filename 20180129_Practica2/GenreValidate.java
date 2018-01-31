public class GenreValidate implements iField{
	public Boolean Validate(String genre){
		if(genre == null || genre.length() > 1){
			System.out.println("Género no valido");
			return false;
		}
		return true;
	}
}