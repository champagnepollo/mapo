class Client{
	public static void main(String[] args) {
		Invoker in = new Invoker();
		Command com = new TurnLightsOn();
		Command com2 = new TurnVolumeDown();
		Command com3 = new TurnLightsOff();
		
		in.setCommand(com);
		in.setCommand(com2);
		in.setCommand(com3);
		in.buttonPressed(2);
		in.undoButton();
	}
}