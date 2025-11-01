public class TextFormatStrategyFactory {
    public static TextFormatStrategy createFormatStrategy(String type) {
        switch (type.toLowerCase()) {
            case "bold":
                return new BoldFormat();
            case "italic":
                return new ItalicFormat();
            case "underline":
                return new UnderlineFormat();
            default:
                throw new IllegalArgumentException("Invalid format type");
        }
    }
}
