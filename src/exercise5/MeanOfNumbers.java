package exercise5;

public class MeanOfNumbers {
    public static void main(String[] args) {

        int number = 223456;
        System.out.printf("\nArithmetic mean of digits is %.3f", calculateArithmeticAverage(number));
        System.out.printf("\nGeometric mean of digits is %.3f\n", calculateGeometricAverage(number));
    }

    private static double calculateArithmeticAverage(int number) {
        double res = number % 10 + number / 10 % 10 + number / 100 % 10 + number / 1000 % 10 +
                number / 10000 % 10 + number / 100000 % 10;
        return res / 6;
    }

    private static double calculateGeometricAverage(int number) {
        return Math.pow((number % 10) * (number / 10 % 10) * (number / 100 % 10) * (number / 1000 % 10) *
                (number / 10000 % 10) * (number / 100000 % 10), 1.0 / 6.0);
    }
}
