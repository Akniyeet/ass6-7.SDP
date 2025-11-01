public class ItalicFormat implements TextFormatStrategy {
    @Override
    public String format(String text) {
        return "<i>" + text + "</i>";
    }
}

