class Genre extends Field{
	GenreValidate genre = new GenreValidate();
	public Boolean save(){
		return genre.Validate(field);
	}
}