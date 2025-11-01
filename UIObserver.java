public class UIObserver implements TextEditorObserver {
    @Override
    public void update(String eventType, String message) {
        if (eventType.equals("DocumentCreated")) {
            System.out.println("The new document has been created.");
        } else if (eventType.equals("TextWritten")) {
            System.out.println("The text has been written.");
        } else if (eventType.equals("EditingStyle")) {
            System.out.println("Editing the text style...");
        } else if (eventType.equals("FormatChange")) {
            System.out.println("FormatChange - " + message);
        } else if (eventType.equals("ChosenStyle")) {
            System.out.println("Chosen the \"" + message + "\" style.");
        } else if (eventType.equals("TextStyleChanged")) {
            System.out.println("The text style has been changed.");
        } else if (eventType.equals("DocumentSave")) {
            System.out.println("Document saved.");
        }
    }
}
