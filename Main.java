
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Print the menu of main function.
        System.out.println(" Menu: ");
        System.out.println(" 1. Check Prime Number ");
        System.out.println(" 2. Lucky Number ");
        System.out.println(" 3. Reversing Number ");
        System.out.println(" 4. Money Exchange ");
        System.out.println(" 5. Max among 8 Numbers ");
        System.out.println(" 6. Leap Year ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose the menu above: ");
        int choice = scanner.nextInt();
        //while(1>0) {

        switch (choice) {
            case 1:
                System.out.println("********** Check Prime Number **********");
                System.out.print("Input number to check whether it is a prime number: ");
                int inputNumber = scanner.nextInt();
                Primenumber primeNumber = new Primenumber(inputNumber);

                if (primeNumber.isPrime()) {
                    System.out.print(inputNumber + " is a prime number.\n");
                    System.out.println("End Problem:4.1=====================================\n");
                } else {
                    System.out.print(inputNumber + " is not a prime number.\n");
                    System.out.println("End Problem:4.1=====================================\n");


                }
                break;

            case 2:
                System.out.println("********** Program for testing lucky number **********");
                Scanner input = new Scanner(System.in);
                System.out.println("Program for testing for lucky number.");
                System.out.print("Please input 6 digits number: ");
                int Inputnumber = input.nextInt();
                LuckyNumber luckynumber = new LuckyNumber(Inputnumber);

                if (!luckynumber.isvalid()) {
                    System.out.println("Invalid input number, please input only a 6-digit number.");
                } else {
                    luckynumber.isLucky();
                }
                input.close();

                break;
            case 3:
                System.out.println("********** Program for testing Reversing Number **********");

                Scanner sc = new Scanner(System.in);
                System.out.println("Program for reversing a 4-digit number.");
                System.out.print("Please input 4 digits number: ");
                int number = scanner.nextInt();
                ReversingNumber numberRev = new ReversingNumber();
                if (numberRev.isValidNumber(number)) {
                    int reversedNumber = numberRev.reverseNumber(number);
                    System.out.println("After reverse: " + reversedNumber);
                } else {
                    System.out.println("Error: invalid number, please input only 4 digits number.");
                }
                break;
            case 4:
                System.out.println("********** Program for testing Exchange money **********");
                MoneyExchange moneyexchange = new MoneyExchange();
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("********** Riel to Dollar **********");
                        System.out.printf("Input money in RIEL: ");
                        int riel2dollar = scanner.nextInt();
                        System.out.printf("%d RIELS = %.3f DOLLARS", riel2dollar, moneyexchange.riel2Dollar(riel2dollar));
                        break;
                    case 2:
                        System.out.println("********** Riel to Thai Baht **********");
                        System.out.printf("Input money in RIEL: ");
                        int riel2baht = scanner.nextInt();
                        System.out.printf("%d RIELS = %.3f BAHTS", riel2baht, moneyexchange.riel2Baht(riel2baht));
                        break;
                    case 3:
                        System.out.println("********** Dollar to Riel **********");
                        System.out.printf("Input money in DOLLAR: ");
                        int dollar2riel = scanner.nextInt();
                        System.out.printf("%d DOLLARS = %.3f RIELS", dollar2riel, moneyexchange.dollar2Riel(dollar2riel));
                        break;
                    case 4:
                        System.out.println("********** Dollar to Baht **********");
                        System.out.printf("Input money in DOLLAR: ");
                        int dollar2baht = scanner.nextInt();
                        System.out.printf("%d DOLLARS = %.3f BAHTS", dollar2baht, moneyexchange.dollar2Baht(dollar2baht));
                        break;
                    case 5:
                        System.out.println("********** Baht to Riel **********");
                        System.out.printf("Input money in BAHT: ");
                        int baht2riel = scanner.nextInt();
                        System.out.printf("%d BAHTS = %.3fRIELS", baht2riel, moneyexchange.baht2Riel(baht2riel));
                        break;
                    case 6:
                        System.out.println("********** Exit **********");
                        break;

                }
            case 5:
                System.out.println("********** Max among 8 Numbers  **********");
                Maxamong8Numbers.finmax();

                break;
            case 6:
                System.out.println("********** Leap Year  **********");
                LeapYear.checkleapyear();

                break;

        }

    }
}