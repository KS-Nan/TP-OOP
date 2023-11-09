import java.util.Scanner;

public class LeapYear {
    public static void checkleapyear() {
        System.out.print("Please input year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}