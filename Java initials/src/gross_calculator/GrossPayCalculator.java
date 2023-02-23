package gross_calculator;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
//       Vaiables
        int hours = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of hours");
        hours = scanner.nextInt();
        double payRate = 0;
        System.out.println("Enter pay rate");
        payRate = scanner.nextDouble();
        double ans = hours*payRate;
        scanner.close();
        System.out.println("Gross pay: "+ ans);
    }
}
