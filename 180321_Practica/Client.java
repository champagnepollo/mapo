class Client{
	public static void main(String[] args) {
		Invoker in = new Invoker();
		MacroCommand macro = new MacroCommand();
		Command com = new TurnLightsOn();
		Command com2 = new TurnVolumeDown();
		Command com3 = new TurnLightsOff();
		Command fan = new CeilingCommand();
		
		macro.addCommand(com);
		macro.addCommand(com2);
		macro.addCommand(com3);

		in.setCommand(com);
		in.setCommand(com2);
		in.setCommand(com3);
		in.setCommand(fan);
		in.setCommand(macro);
		in.buttonPressed(5);
	}
}