class TurnLightsOn implements Command{
	Receiver receiver = new Lights();
	String ex = null;
	public void execute(){
		ex = "Se encienden ";
		TurnLightsOn();
	}
	public void undo(){
		ex = "undo encender ";
		TurnLightsOn();
	}
	void TurnLightsOn(){
		receiver.action(ex);
	}
}