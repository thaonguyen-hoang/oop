package designpatterns.command.editorcommand;

public class UndoCommand extends Command {
    public UndoCommand(App app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.undo();
        return false;
    }
}
