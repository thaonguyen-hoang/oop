package designpatterns.command.editorcommand;

public class CutCommand extends Command {
    public CutCommand(App app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        if (editor.getSelection() == null | editor.getSelection().isEmpty()) {
            return false;
        } else {
            saveBackup();
            app.clipboard = editor.getSelection();
            editor.deleteSelection();
            return true;
        }
    }
}
