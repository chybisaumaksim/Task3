package exercise2;

public class ABCNumbers {

    public static void main(String[] args) {
        double a = 34;
        double b = 24;
        double c = 34;

        checkIfEquals(a, b, c);
    }

    private static void checkIfEquals(double a, double b, double c) {
        if (a == b && a == c && b == c) {
            System.out.println("a, b, c are equals");
        } else {
            System.out.println("a, b, c aren't equals");
        }
    }
}
