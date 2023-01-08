package designpatterns.command.editorcommand;

public class PasteCommand extends Command {
    public PasteCommand(App app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        if (app.clipboard == null || app.clipboard.isEmpty()) {
            return false;
        } else {
            saveBackup();
            editor.replaceSelection(app.clipboard);
            return true;
        }
    }
}
