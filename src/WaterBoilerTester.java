import java.util.Scanner;
public class WaterBoilerTester {
    public static void main(String[] args) {
        WaterBoiler kettle;
        kettle = new WaterBoiler();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        int temp = in.nextInt();
        System.out.println("Enter the altitude in meters: ");
        int alt = in.nextInt();
        kettle.getState(temp, alt);
        System.out.print("A temperature of over 100 or below zero would be boiling or freezing respectively");

    }
}
