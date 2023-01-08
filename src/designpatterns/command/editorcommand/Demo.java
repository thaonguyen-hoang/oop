package designpatterns.command.editorcommand;

public class Demo {
    public static void main(String[] args) {
        App app = new App();
        Editor editor = new Editor();

        Command copy = new CopyCommand(app, editor);
        Command paste = new PasteCommand(app, editor);
        Command cut = new CutCommand(app, editor);
        Command undo = new UndoCommand(app, editor);

        System.out.println("clipboard now: " + app.clipboard);
        System.out.println("selection now: " + editor.getSelection());
        System.out.println();

        System.out.println("select a word to copy");
        editor.replaceSelection("apple");
        System.out.println("selection now: " + editor.getSelection());
        System.out.println("copy the word");
        app.executeCommand(copy);
        System.out.println("clipboard after copying: " + app.clipboard);
        System.out.println();

        System.out.println("select another word to paste over");
        editor.replaceSelection("banana");
        System.out.println("selection now: " + editor.getSelection());
        app.executeCommand(paste);
        System.out.println("selection after pasting: " + editor.getSelection());
        System.out.println();

        System.out.println("select a word to cut");
        editor.replaceSelection("grape");
        System.out.println("selection now: " + editor.getSelection());
        app.executeCommand(cut);
        System.out.println("selection after cutting: " + editor.getSelection());
        System.out.println();

        System.out.println("undo the previous command");
        app.executeCommand(undo);
        System.out.println("selection now: " + editor.getSelection());
    }
}
