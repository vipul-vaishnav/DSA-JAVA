public class LC1678 {
    // 1678. Goal Parser Interpretation

    public static void main(String[] args) {
        String command = "G()()()()(al)";
        String parse = interpret(command);
        System.out.println(parse);
    }

    public static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");

        // String newStr = new String("");

        // for (int i = 0; i < command.length(); i++) {
        // if (command.charAt(i) == 'G') {
        // newStr += "G";
        // } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
        // newStr += "o";
        // } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a' &&
        // command.charAt(i + 2) == 'l' && command.charAt(i + 3) == ')') {
        // newStr += "al";
        // }
        // }

        // return newStr;
    }
}
