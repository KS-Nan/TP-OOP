import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("TP02.0\n");

        System.out.print("Please input your favorite subject: ");
        String favSubject = scanner.nextLine();
        System.out.println("Your favorite subject is: " + favSubject);
        System.out.print("TP02.1\n");

        System.out.print("Please Input your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s!",name);
        System.out.print("TP02.2\n");

        System.out.print("Program for calculating perimeter and surface of a Rectangle.\n");
        System.out.print("Please input width (in meter):");
        double width = scanner.nextDouble();
        System.out.print("Please input height (in meter):");
        double height = scanner.nextDouble();
        double parimeter = 2 * (height + width);
        double surface = width * height ;
        System.out.println("parimeter = ("+width +"+" + height +") x 2 -" + parimeter+ "m");
        System.out.println("surface = "+ width +"x" + height +" - " + surface +"m^2");
        System.out.print("TP02.3\n");

        System.out.print("Program for calculating equation 1/x = 1/y + 1/z.\n");
        System.out.print("Please input y:");
        float y = scanner.nextFloat();
        System.out.print("Please input z:");
        double z = scanner.nextDouble();
        double x = 1/((1/y)+(1/z));
        System.out.println("Result x = " + x);
        System.out.print("TP02.4\n");

        System.out.println("Program for counting the number of hundreds.\n");
        System.out.print("Please input a positive number: ");
        int number = scanner.nextInt();

        int hundreds = number / 100;

        System.out.println("There are " + hundreds + " hundred in number " + number + ".");
        System.out.print("TP02.5\n");

        System.out.print("Program for guessing your luckiness.\n");
        System.out.print("Please input a positive number:");
        int numbers = scanner.nextInt();
        int luckynumber = numbers + 1;
        System.out.print("I got " + luckynumber+ ". I am luckier.");
        System.out.print("TP02.6\n");
        System.out.print("Write a Java program to calculate the summation of integers. \n");
        for(int i =1; i<=3; i++){
            System.out.print("Input the start number:");
            int startnumber = scanner.nextInt();
            System.out.print("Input the end number: ");
            int endnumber = scanner.nextInt();
            System.out.print("Input the increment: ");
            int incrementnumber = scanner.nextInt();
             int n = (endnumber - startnumber)/ incrementnumber +1 ;
             double summation = (double) n / 2 * (2 * startnumber + (n - 1) * incrementnumber);
            System.out.println("The summation is : " + summation);
        }



}
}