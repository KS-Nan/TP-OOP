import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TP-03.1==================================================\n");
        System.out.print("Input number of seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        System.out.println("Time corresponding to " + totalSeconds + " seconds is " + formattedTime);

        System.out.println("TP-03.2==================================================\n");
        System.out.print("Please input hours:");

        hours = scanner.nextInt();
        System.out.print("Please input minutes:");

        minutes = scanner.nextInt();

        System.out.print("Please input seconds:");
        seconds = scanner.nextInt();


        int totalseconds = hours * 3600 + minutes * 60 + seconds;

        System.out.println("Number of seconds is: " + hours + "*3600" + minutes + "*60" + seconds + "=" + totalseconds);

        System.out.println("TP-03.3==================================================\n");
        System.out.println("Program for calculating cost of a call");

        System.out.print("Please input start hours:");
        int starthours = scanner.nextInt();

        System.out.print("Please input start minutes:");

        int startminutes = scanner.nextInt();

        System.out.print("Please input start seconds:");
        int startseconds = scanner.nextInt();

        System.out.print("Please input end hours:");
        int endhours = scanner.nextInt();

        System.out.print("Please input end minutes:");

        int endminutes = scanner.nextInt();

        System.out.print("Please input end seconds:");
        int endseconds = scanner.nextInt();

        int totalcalldurationseconds = (endhours - starthours) * 3600 + (endminutes - startminutes) * 60 + (endseconds - startseconds);
        int totalhours = totalcalldurationseconds / 3600;
        int totalcalldurationminutes = (totalcalldurationseconds % 3600) / 60;
        double totalCallCost = totalcalldurationminutes * 0.05;

        System.out.println("Total call duration: " + totalhours + "h " + (totalcalldurationminutes % 60) + "mn " + (totalcalldurationseconds % 60) + "s");
        System.out.println("Total cost of this call: $" + totalCallCost);

        System.out.println("TP-03.4==================================================\n");
        System.out.println("Program for converting money in Riels to Dollars");

        System.out.print("Please input Dollar money: ");
        Float USD = scanner.nextFloat();
        Float ConversionUSDrate = USD * 4000;
        System.out.println("Conversion rate is:" + ConversionUSDrate + "RIELS");

        System.out.print("Please input Riels money: ");
        int Riels = scanner.nextInt();
        int ConversionRrate = Riels / 4000;
        System.out.println("Conversion rate is:" + ConversionRrate + "$");

        System.out.println("TP-03.5==================================================\n");

        System.out.println("Program for calculating duration of travel from ITC to Airport");

        int distance = 7;
        int speed = 30;
        System.out.print("Please input traffic jam factor (in percentage [0-100]): ");
        int traffic_jam = scanner.nextInt();
        double adjspeed = speed * (1 - (traffic_jam / 100));
        double duration = 2 * (distance / adjspeed);
        // Convert the duration to hours, minutes, and seconds
        int Hours = (int) duration;
        int Minutes = (int) ((duration - Hours) * 60);
        int Seconds = (int) (((duration - Hours) * 60 - Minutes) * 60);

        System.out.printf("Travelling Duration = %02d:%02d:%02d%n", Hours, Minutes, Seconds);

        System.out.println("TP-03.6==================================================\n");

        System.out.print("Please input a floating-point number: ");
        double floatingpoint = scanner.nextDouble();

        String numberStr = Double.toString(floatingpoint);
        String[] parts = numberStr.split("\\.");
        String integralPart = parts[0];
        String fractionalPart = parts[1];

        int integralDigits = integralPart.length();
        int fractDigits = fractionalPart.length();

        System.out.println("Number of digits in the integral part: " + integralDigits);
        System.out.println("Number of digits in the fractional part: " + fractDigits);

        System.out.println("TP-03.7==================================================\n");

        System.out.print("Enter the text: ");

        String  text = scanner.nextLine();

        System.out.print("Enter the letter to find in words: ");
        String letter = scanner.nextLine();
        // List of words that contain the letter
        String[] words = text.split("[\\s\\p{Punct}]+");
        String[] words_contain_letter = new String[words.length];
        int count = 0;
        for (String word : words) {
            if (word.contains(letter)) {
                words_contain_letter[count] = word;
                count++;



            }

        }
        System.out.println("Words that contain letter: " + letter);
        for (int i = 0; i < count; i++) {
            System.out.println("| " + words_contain_letter[i]);
        }
        System.out.println("\nThere are " + count + " words that contain letter '" + letter + "'.");

    }
}

