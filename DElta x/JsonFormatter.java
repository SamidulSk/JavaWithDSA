public class JsonFormatter {

    public static String formatJson(String input) {
        StringBuilder result = new StringBuilder();
        int indent = 0;
        boolean inQuotes = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '\"') {
                inQuotes = !inQuotes;
                result.append(ch);
            } else if (!inQuotes && (ch == '{' || ch == '[')) {
                result.append(ch);
                indent++;
                result.append("*".repeat(indent * 2));
            } else if (!inQuotes && (ch == '}' || ch == ']')) {
                indent--;
                result.append("*".repeat(indent * 2));
                result.append(ch);
            } else if (!inQuotes && ch == ',') {
                result.append(ch);
                result.append("*".repeat(indent * 2));
            } else if (!inQuotes && ch == ':') {
                result.append(" : ");
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "{\"name\":\"John\", \"email\":\"john.d@gmail.com\"}";
        String output = formatJson(input);
        System.out.println(output);
    }
}
