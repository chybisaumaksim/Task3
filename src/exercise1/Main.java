package exercise1;

public class Main {

    public static void main(String[] args) {
        View.print("This program measures the weight of a dinosaur in different mass units.");

        double weightInKilograms = 35_230;

        View.print("Dinosaur weight in milligrams is " + DinoWeight.calculateInMilligrams(weightInKilograms));
        View.print("Dinosaur weight in grams is " + DinoWeight.calculateInGrams(weightInKilograms));
        View.print("Dinosaur weight in tons is " + DinoWeight.calculateInTons(weightInKilograms));
    }
}
