import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Richard Marshall on 2/3/16.
 */
public class Atm {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome!");

        User user = new User();

        user.enterName();

        boolean checkContinue = true;

        while (checkContinue) {
            user.checkInput();

            if (user.input.equals("1")) {
                user.checkBalance();
            }
            else if (user.input.equals("2")) {
                user.withdraw();
            }
            else if (user.input.equals("3")) {
                System.out.println("Thank you and please come again.");
                checkContinue = false;
            }
            else if (user.input.equals("4")) {
                System.out.println("Deleting account, have a nice day.");
                user.deleteAccount();
                checkContinue = false;
            }
            else {
                throw new Exception("Invalid input");
            }
        }
    }

}
