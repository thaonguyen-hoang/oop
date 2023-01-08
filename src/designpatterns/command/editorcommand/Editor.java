package designpatterns.command.editorcommand;

public class Editor {
    public String selectedText;

    public String getSelection() {
        return selectedText;
    }

    public void deleteSelection() {
        selectedText = "";
    }

    public void replaceSelection(String text) {
        selectedText = text;
    }
}
