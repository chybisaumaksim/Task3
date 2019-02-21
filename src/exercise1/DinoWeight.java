package exercise1;

public class DinoWeight {
    public static double calculateInMilligrams(double weightOfDinoInKilos) {
        return weightOfDinoInKilos*1E6;
    }

    public static double calculateInGrams(double weightOfDinoInKilos) {
        return weightOfDinoInKilos*1000;
    }

    public static double calculateInTons(double weightOfDinoInKilos) {
        return weightOfDinoInKilos/1000;
    }
}
