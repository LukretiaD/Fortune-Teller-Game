
import java.util.Scanner;

public class KeyboardInputs {

    private Scanner input = new Scanner(System.in);

    public String getStringValue(String prompt) {
        String value;
        System.out.println(prompt + ": ");
        value = input.nextLine();
        return value;

    }

    public int getIntegerValue(String prompt) {
        int value = 0;
        boolean exitMethod = false;

        do {
            System.out.println(prompt + ": ");

            try {
                String checkValue = input.nextLine();
                value = Integer.parseInt(checkValue);
                exitMethod = true;

            } catch (NumberFormatException ne) {
                System.out.println( "You did not enter a number");

            }

        } while (!exitMethod);

        return value;
    }
}
