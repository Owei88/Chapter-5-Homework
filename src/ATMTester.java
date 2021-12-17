import java.util.Scanner;
public class ATMTester {
    public static void main(String[] args) {
        ATM machine;
        machine = new ATM();
        Scanner in= new Scanner(System.in);
        System.out.print("Enter your PIN: ");

         int input = in.nextInt();
         machine.getPin(input);
         System.out.print("Enter your PIN: ");

         int input2 = in.nextInt();
         machine.getPin(input2);
         System.out.print("Enter your PIN: ");

         int input3 = in.nextInt();
         machine.getPin(input3);

        System.out.println("PIN should be 1234, if it's not, then ask again for 2 more times.");
    }


}
