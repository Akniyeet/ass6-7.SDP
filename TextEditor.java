import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private TextFormatStrategy formatStrategy;
    private List<TextEditorObserver> observers = new ArrayList<>();

    public void addObserver(TextEditorObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TextEditorObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String eventType, String message) {
        for (TextEditorObserver observer : observers) {
            observer.update(eventType, message);
        }
    }

    public void createDocument() {
        System.out.println("Creating the new document...");
        notifyObservers("DocumentCreated", "");
    }

    public void writeText(String text) {
        System.out.println("Writing the text...");
        notifyObservers("TextWritten", text);
    }

    public void editTextStyle() {
        notifyObservers("EditingStyle", "");
    }

    public void showTextFormattingStyles() {
        System.out.println("Showing the types of text formatting styles:");
        notifyObservers("FormatChange", "<b>Software Design Patterns</b>");
        notifyObservers("FormatChange", "<i>Software Design Patterns</i>");
        notifyObservers("FormatChange", "<u>Software Design Patterns</u>");
    }

    public void chooseTextStyle(String style) {
        notifyObservers("ChosenStyle", style);
        notifyObservers("TextStyleChanged", "");
    }

    public void saveDocument() {
        notifyObservers("DocumentSave", "The document was saved.");
    }

    public void setFormatStrategy(TextFormatStrategy formatStrategy) {
        this.formatStrategy = formatStrategy;
    }

    public void applyFormat(String text) {
        String formattedText = formatStrategy.format(text);
        notifyObservers("FormatChange", formattedText);
    }
}
