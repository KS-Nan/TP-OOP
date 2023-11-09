public class LuckyNumber {
    int number;
    public LuckyNumber(int Num){
        this.number = Num;
    }
    public boolean isLucky() {
        int firstHalfnumber = number / 1000;
        int secondHalfnumber = number % 1000;
        int sumfirstHalf = 0;
        int sumsecondHalf = 0;
        while (firstHalfnumber > 0) {
            sumfirstHalf= sumfirstHalf + firstHalfnumber % 10;
            firstHalfnumber = firstHalfnumber / 10;
        }
        while (secondHalfnumber > 0) {
            sumsecondHalf = sumsecondHalf + secondHalfnumber % 10;
            secondHalfnumber = secondHalfnumber / 10;
        }
        if (sumfirstHalf != sumsecondHalf) {

            System.out.printf("%d is not lucky number.",this.number );
            return false;
        }
        else{
            System.out.printf("%d is lucky number.",this.number );

        }
        return true;
    }
    public boolean isvalid(){
        return number >= 100000 && number <= 999999;

    }

}