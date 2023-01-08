package oop.lab09.comparator;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        list.add(new Movie("Star vs The Force of Evil", 8.4, 1992));

        // Sort by rating
        System.out.println("Sorted by rating:");
        RatingCompare ratingCompare = new RatingCompare();
        list.sort(ratingCompare);

        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }

        // Sort by name
        System.out.println("\nSorted by name:");
        NameCompare nameCompare = new NameCompare();
        list.sort(nameCompare);

        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year:");
        Collections.sort(list);

        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}
