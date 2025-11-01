public class TextEditorBuilder {
    private TextEditor editor;

    public TextEditorBuilder() {
        this.editor = new TextEditor();
    }

    public TextEditorBuilder withFormatStrategy(TextFormatStrategy strategy) {
        editor.setFormatStrategy(strategy);
        return this;
    }

    public TextEditorBuilder addObserver(TextEditorObserver observer) {
        editor.addObserver(observer);
        return this;
    }

    public TextEditor build() {
        return editor;
    }
}
