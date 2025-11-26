import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String predefined = "Carmen";

        System.out.print("Enter your name > ");
        String userInput = input.nextLine();

        if (userInput.equals(predefined)) {
            System.out.println("Carmen equals " + userInput);
        } else {
            System.out.println("Carmen does not equal " + userInput);
        }

        input.close();
    }
}
