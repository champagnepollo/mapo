class Email extends Field{
	EmailValidate email = new EmailValidate();
	public Boolean save(){
		return email.Validate(field);
	}
}