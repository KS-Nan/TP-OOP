public class ReversingNumber {


    // Method to check if the input number is 4 digits
    public boolean isValidNumber(int number) {
        return number >= 1000 && number <= 9999;
    }

    // Method to reverse the input 4-digit number
    public int reverseNumber(int num) {
        int reversedNumber = 0;
        while (num != 0) {
            reversedNumber = reversedNumber * 10 + num % 10;
            num = num / 10;
        }
        return reversedNumber;
    }

}