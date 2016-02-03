/**
 * Created by Richard Marshall on 2/3/16.
 */
public class User {
    public String name;
    public int balance = 100;
    public String input;

    public void enterName() throws Exception {
        System.out.println("Please enter your name");

        name = Atm.scanner.nextLine();

        if (name.length() < 1) {
            throw new Exception("Please enter a valid name.");
        }

        else {
            System.out.println("Welcome " + name);
        }
    }

    public void checkInput() {
        System.out.println("Enter 1 to check balance. Enter 2 to withdraw funds. Enter 3 to cancel.");
        input=Atm.scanner.nextLine();
    }

    public void checkBalance() {
        System.out.println("Your balance is $" + balance);
    }

    public void withdraw() throws Exception {
        System.out.println("Please enter a money ammount to withdraw.");

        String numStr = Atm.scanner.nextLine();
        int numInt = Integer.valueOf(numStr);

        if (numInt > balance){
            throw new Exception("Insufficient Funds");
        }

        else {
            System.out.println("Please take your money.");
        }
    }
}
