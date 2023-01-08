package oop.lab10.oop.library;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        long[] rentals = new long[rents.length];
        for (int i = 0; i < rentals.length; i++) {
            rentals[i] = rents[i].end.getTime() - rents[i].begin.getTime();
        }

        int longestRentIndex = 0;
        for (int i = 0; i < rentals.length; i++) {
            if (rentals[i] > rentals[longestRentIndex]) {
                longestRentIndex = i;
            }
        }
        return rents[longestRentIndex];
    }
}
