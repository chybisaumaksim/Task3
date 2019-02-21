package exercise7;

public class TwoVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        swap(a, b);
    }

    private static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a " + a);
        System.out.println("b " + b);
    }
}
