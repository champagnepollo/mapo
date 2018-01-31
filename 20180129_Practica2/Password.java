class Password extends Field{
	PasswordValidate password = new PasswordValidate();
	public Boolean save(){
		return password.Validate(field);
	}
}