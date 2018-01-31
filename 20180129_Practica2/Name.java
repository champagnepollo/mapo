class Name extends Field{
	NameValidate name = new NameValidate();
	public Boolean save(){
		return name.Validate(field);
	}
}