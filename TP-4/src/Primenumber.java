public class Primenumber {
    int number;
    int divisibleNum;

    public Primenumber(int Number) {
        this.number = Number;
    }

    public boolean isPrime() {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}