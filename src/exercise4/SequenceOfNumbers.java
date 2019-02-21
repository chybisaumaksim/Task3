package exercise4;

public class SequenceOfNumbers {

    public static void main(String[] args) {

        int a = 4321;
        sequenceCheck(a);
    }

    private static void sequenceCheck(int a) {
        if (a % 10 > (a / 10) % 10 && (a / 10) % 10 > (a / 100) % 10 && (a / 100) % 10 > (a / 1000) % 10) {
            System.out.println("The number is represented by a decreasing sequence of numbers");
        } else if (a % 10 < (a / 10) % 10 && (a / 10) % 10 < (a / 100) % 10 && (a / 100) % 10 < (a / 1000) % 10) {
            System.out.println("The number is represented by an increasing sequence of numbers");
        } else {
            System.out.println("The number not represented neither decreasing nor increasing sequence");
        }
    }
}
