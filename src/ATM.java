public class ATM {
    int numberOfTries;
    public void getPin(int input) {
        /**
         * checks if input is the PIN, if it's not, then check if number of tries is less than 2
         * (3 because java counts from 0)
         * otherwise will block bank card.
         * @param input is the PIN the user gives
         */

        if (input == 1234) {
            System.out.println("Your PIN is correct");
            System.exit(0);
        } else if (numberOfTries < 2) {
            System.out.println("Your pin is incorrect, please try again:");
            numberOfTries++;
        } else {
            System.out.println("You have answered incorrectly too many times, your bank card is now blocked");
            System.exit(0);
        }
    }
    }

