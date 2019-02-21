package exercise3;

public class RingArea {
    public static void main(String[] args) {

        double r1 = 12;
        double r2 = 10;
        System.out.printf("The area of the ring is %.3f", findTheRingArea(r1, r2));
    }

    private static double findTheRingArea(double r1, double r2) {
        return Math.PI * (Math.pow(r1, 2) - Math.pow(r2, 2));
    }
}
