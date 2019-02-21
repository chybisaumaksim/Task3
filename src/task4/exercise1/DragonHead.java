package task4.exercise1;

class DragonHead {

    static String calculateHeadsAndEyes(int age, int FIRST_PERIOD, int SECOND_PERIOD) {
        int heads = 3;
        if (age <= FIRST_PERIOD) {
            heads += age * 3;
        } else if (age <= SECOND_PERIOD) {
            heads += FIRST_PERIOD * 3 + (age - FIRST_PERIOD) * 2;
        } else {
            heads += FIRST_PERIOD * 3 + (age - FIRST_PERIOD) * 2 + (age - SECOND_PERIOD);
        }
        return "The number of dragon heads is " + heads + " and the number of eyes is " + heads * 2;
    }
}
