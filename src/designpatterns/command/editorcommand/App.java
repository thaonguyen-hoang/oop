package designpatterns.command.editorcommand;

public class App {
    public String clipboard;
    public CommandHistory history;

    public App() {
        clipboard = "";
        history = new CommandHistory();
    }

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }
    public void undo() {
        if (history.isEmpty()) {
            return;
        }

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
