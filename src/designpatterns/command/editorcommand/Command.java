package designpatterns.command.editorcommand;

public abstract class Command {
    protected App app;
    protected Editor editor;
    private String backup;

    public Command(App app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    public void saveBackup() {
        backup = editor.selectedText;
    }

    public void undo() {
        editor.selectedText = backup;
    }

    public abstract boolean execute();
}
