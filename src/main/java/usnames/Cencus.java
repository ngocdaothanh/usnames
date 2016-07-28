package usnames;

import java.util.Iterator;

public class Cencus {
    public static Iterator<String> popularLastNames() {
        return Resource.names(Resource.lines(Cencus.class.getResourceAsStream("census-dist-2500-last.txt")));
    }

    public static Iterator<String> allLastNames() {
        return Resource.names(Resource.lines(Cencus.class.getResourceAsStream("census-dist-all-last.txt")));
    }

    public static Iterator<String> femaleFirstNames() {
        return Resource.names(Resource.lines(Cencus.class.getResourceAsStream("census-dist-female-first.txt")));
    }

    public static Iterator<String> maleFirstNames() {
        return Resource.names(Resource.lines(Cencus.class.getResourceAsStream("census-dist-male-first.txt")));
    }
}
