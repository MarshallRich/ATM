import java.util.HashMap;

/**
 * Created by Richard Marshall on 2/3/16.
 */
public class User {
    public String name;
    public double balance;
    public String input;
    public HashMap<String, Double> accountMap = new HashMap<>();

    public void enterName() throws Exception {
        System.out.println("Please enter your name");

        name = Atm.scanner.nextLine();

        if (name.length() < 1) {
            throw new Exception("Please enter a valid name.");
        }

        else if (accountMap.containsKey(name)){
            System.out.println("Welcome " + name);
        }

        else {
            System.out.println("Welcome " + name);
            System.out.println("We do not have an account in your name, would you like to create one? [y/n]");
            String createAccount = Atm.scanner.nextLine();

            if (createAccount.equalsIgnoreCase("y")){
                accountMap.put(name, 0.00);
                System.out.println("Account Created");
            }

            else{
                throw new Exception("Goodbye");
            }

        }
    }

    public void checkInput() {
        System.out.println("Enter 1 to check balance. Enter 2 to withdraw funds. Enter 3 to cancel. Enter 4 to delete your account.");
        input=Atm.scanner.nextLine();
    }

    public void checkBalance() {
        balance = accountMap.get(name);
        System.out.println("Your balance is $" + balance);
    }

    public void withdraw() throws Exception {
        System.out.println("Please enter a money amount to withdraw.");

        Double balanceCheck = Atm.scanner.nextDouble();

        if (balanceCheck > balance){
            throw new Exception("Insufficient Funds");
        }

        else {
            System.out.println("Please take your money.");
        }
    }

    public void deleteAccount() {
        accountMap.remove(name);
    }
}
