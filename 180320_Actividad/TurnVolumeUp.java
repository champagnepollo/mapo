class TurnVolumeUp implements Command{
	Receiver receiver = new TV();
	String ex = null;
	public void execute(){
		ex = "Se sube el volumen ";
		TurnVolumeUp();
	}
	public void undo(){
		ex = "undo ";
		TurnVolumeUp();
	}
	void TurnVolumeUp(){
		receiver.action(ex);
	}
}