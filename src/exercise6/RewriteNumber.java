package exercise6;

public class RewriteNumber {
    public static void main(String[] args) {

        int number = 1234567;
        flipTheNumber(number);
        System.out.println("Inverted number is " + flipTheNumber(number));
    }

    private static String flipTheNumber(int number) {
        return number % 10 + "" + number / 10 % 10 + "" + number / 100 % 10 + "" + number / 1000 % 10 + "" +
                number / 10000 % 10 + "" + number / 100000 % 10 + "" + number / 1000000 % 10;
    }
}
