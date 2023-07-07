import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        String operation = "1 + 2";

        Pattern pattern = Pattern.compile("^\\s*(\\d+)\\s*([+\\-*/])\\s*(\\d+)\\s*$");
        Matcher matcher = pattern.matcher(operation);
        if (matcher.matches()) {
            Integer firstOperand = Integer.parseInt(matcher.group(1));
            Integer secondOperand = Integer.parseInt(matcher.group(3));
            String operator = matcher.group(2);
            System.out.printf("first operand is: %s\n", firstOperand);
            System.out.printf("operator is: %s\n", operator);
            System.out.printf("second operand is: %s\n", secondOperand);
        }
    }

}
