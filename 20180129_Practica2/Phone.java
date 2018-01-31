class Phone extends Field{
	PhoneValidate phone = new PhoneValidate();
	public Boolean save(){
		return phone.Validate(field);
	}
}