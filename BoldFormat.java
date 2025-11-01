public class BoldFormat implements TextFormatStrategy {
    @Override
    public String format(String text) {
        return "<b>" + text + "</b>";
    }
}
