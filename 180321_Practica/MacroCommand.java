import java.util.*;

class MacroCommand implements Command{
	Receiver receiver = new Lights();
	String ex = null;
	List<Command> commands = new ArrayList<Command>();

	public void execute(){
		ex = "Macro: ";
		MacroCommand();
	}
	public void undo(){
		ex = "undo macro: ";
		MacroCommand();
	}
	public void addCommand(Command command){
		commands.add(command);
	}
	void MacroCommand(){
		for (Command command : commands) {
			command.execute();
		}
	}
}