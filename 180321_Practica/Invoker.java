import java.util.*;

class Invoker{
	List<Command> commands = new ArrayList<Command>();
	Command lastCommand;
	public void setCommand(Command command){
		if(commands.size() > 8)
			System.out.println("Lleno");
		else commands.add(command);
	}
	public void buttonPressed(int com){
		lastCommand = commands.get(com-1);
		lastCommand.execute();
	}

	public void undoButton(){
		lastCommand.undo();
	}
}