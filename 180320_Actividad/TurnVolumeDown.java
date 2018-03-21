class TurnVolumeDown implements Command{
	Receiver receiver = new TV();
	String ex = null;
	public void execute(){
		ex = "Se baja el volumen ";
		TurnVolumeDown();
	}
	public void undo(){
		ex = "undo ";
		TurnVolumeDown();
	}
	void TurnVolumeDown(){
		receiver.action(ex);
	}
}