class TurnLightsOff implements Command{
	Receiver receiver = new Lights();
	String ex = null;
	public void execute(){
		ex = "Se apagan ";
		TurnLightsOff();
	}
	public void undo(){
		ex = "undo ";
		TurnLightsOff();
	}
	void TurnLightsOff(){
		receiver.action(ex);
	}
}