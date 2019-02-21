package task4.exercise1;

public class Main {
    final static int FIRST_PERIOD = 200;
    final static int SECOND_PERIOD = 300;

    public static void main(String[] args) {
        int age = 302;
        View.print("This program calculates the number of dragon heads and eyes.");
        View.print(DragonHead.calculateHeadsAndEyes(age, FIRST_PERIOD, SECOND_PERIOD));
    }
}

