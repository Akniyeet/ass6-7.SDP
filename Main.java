public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        UIObserver uiObserver = new UIObserver();
        editor.addObserver(uiObserver);

        editor.createDocument();
        editor.writeText("Software Design Patterns");

        editor.editTextStyle();

        editor.showTextFormattingStyles();

        editor.setFormatStrategy(new BoldFormat());
        editor.chooseTextStyle("Bold");

        editor.saveDocument();
    }
}



