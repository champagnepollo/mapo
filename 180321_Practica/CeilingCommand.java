class CeilingCommand implements Command{
	Receiver receiver = new CeilingFan();
	String ex = null;
	int i = 0;
	public void execute(){
		if (i == 0) {
			ex = slow();
		}
		else if (i == 1) {
			ex = medium();
		}
		else if (i == 2) {
			ex = high();
		}
		else if (i == 3) {
			ex = off();
		}
		CeilingCommand();
	}
	public void undo(){
		if (i == 3) {
			ex = medium();
		}
		else if (i == 2) {
			ex = slow();
		}
		else if (i == 1) {
			ex = off();
		}
		CeilingCommand();
	}
	public String high(){
		i = 3;
		return "en velocidad high";
	}
	public String medium(){
		i = 2;
		return "en velocidad mediana";
	}
	public String slow(){
		i = 1;
		return "en velocidad baja";
	}
	public String off(){
		i = 0;
		return "apagado";
	}
	void CeilingCommand(){
		receiver.action(ex);
	}
}