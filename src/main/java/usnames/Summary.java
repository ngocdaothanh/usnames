package usnames;

import java.util.Iterator;

public class Summary {
    public static Iterator<String> nicknames() {
        return Resource.names(Resource.lines(Summary.class.getResourceAsStream("nicknames.txt")));
    }

    public static Iterator<String> popularFirstNames() {
        return Resource.names(Resource.lines(Summary.class.getResourceAsStream("popular-both-first.txt")));
    }

    public static Iterator<String> popularLastNames() {
        return Resource.names(Resource.lines(Summary.class.getResourceAsStream("popular-last.txt")));
    }

    public static Iterator<String> popularFemaleFirstNames() {
        return Resource.names(Resource.lines(Summary.class.getResourceAsStream("popular-female-first.txt")));
    }

    public static Iterator<String> popularMaleFirstNames() {
        return Resource.names(Resource.lines(Summary.class.getResourceAsStream("popular-male-first.txt")));
    }
}
