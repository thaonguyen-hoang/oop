package designpatterns.command.editorcommand;

public class CopyCommand extends Command {
    public CopyCommand(App app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.clipboard = editor.getSelection();
        return false;
    }
}
