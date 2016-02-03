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
        user.checkInput();

        if (user.input.equals("1")) {
            user.checkBalance();
        }

        else if (user.input.equals("2")) {
            user.withdraw();
        }

        else if (user.input.equals("3")){
            System.out.println("Thank you and please come again.");
        }

        else {
            throw new Exception("Invalid input");
        }
    }

}
