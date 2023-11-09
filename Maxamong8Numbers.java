import java.util.Scanner;

public class Maxamong8Numbers {
    public static void finmax(){
        System.out.print("Please input 8 numbers: ");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        for (int i = 1; i < 8; i++) {
            int number = scanner.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The maximum number is: " + max);
    }
}
