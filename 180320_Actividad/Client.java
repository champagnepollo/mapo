class Client{
	public static void main(String[] args) {
		Invoker in = new Invoker();
		Command com = new TurnLightsOn();
		Command com2 = new TurnVolumeDown();
		
		in.setCommand(com);
		in.buttonPressed();
		in.setCommand(com2);
		in.buttonPressed();
	}
}