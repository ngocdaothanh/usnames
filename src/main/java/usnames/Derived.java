package usnames;

import java.util.Iterator;

public class Derived {
    public static Iterator<String> allFirstNames() {
        return Resource.names(Resource.lines(Derived.class.getResourceAsStream("census-derived-all-first.txt")));
    }

    public static Iterator<String> unisexFirstNames() {
        return Resource.names(Resource.lines(Derived.class.getResourceAsStream("census-derived-unisex-first.txt")));
    }

    public static Iterator<String> commonBothNames() {
        return Resource.names(Resource.lines(Derived.class.getResourceAsStream("census-derived-common-both.txt")));
    }
}
