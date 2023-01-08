package designpatterns.command.shutdowncommand;

import java.util.LinkedList;
import java.util.List;

public class Switch {
    List<Command> historyCommands;

    public Switch() {
        historyCommands = new LinkedList<>();
    }

    public void store(Command command) {
        historyCommands.add(command);
    }

    public void execute(Command command) {
        command.execute();
    }

    public void storeAndExecute(Command command) {
        historyCommands.add(command);
        command.execute();
    }

    public void reexecuteAll() {
        for (Command command : historyCommands) {
            command.execute();
        }
    }
}
