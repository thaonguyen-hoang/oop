package designpatterns.factorymethod.dialog;

public class WebDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
