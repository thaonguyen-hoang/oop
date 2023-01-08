package oop.lab09.comparator;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        String leftname = left.getName().toLowerCase();
        String rightname = right.getName().toLowerCase();
        return leftname.compareTo(rightname);
    }
}
