package usnames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Resource {
    public static Iterator<String> lines(InputStream is) {
        try {
            final Reader charReader = new InputStreamReader(is, "UTF-8");
            final BufferedReader lineReader = new BufferedReader(charReader);

            return new Iterator<String>() {
                private String nextLine = nextLine(lineReader);

                @Override
                public boolean hasNext() {
                    return nextLine != null;
                }

                @Override
                public String next() {
                    if (nextLine == null) throw new NoSuchElementException();

                    String ret = nextLine;
                    nextLine = nextLine(lineReader);
                    return ret;
                }
            };
        } catch (UnsupportedEncodingException e) {
            // Collections.emptyIterator is since Java 1.7, while we want to support 1.6
            return new Iterator<String>() {
                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public String next() {
                    throw new NoSuchElementException();
                }
            };
        }
    }

    static Iterator<String> names(final Iterator<String> lines) {
        return new Iterator<String>() {
            private String nextName = nextName(lines, "");

            @Override
            public boolean hasNext() {
                return nextName != null;
            }

            @Override
            public String next() {
                if (nextName == null) throw new NoSuchElementException();

                String ret = nextName;
                nextName = nextName(lines, ret);
                return ret;
            }
        };
    }

    static String nextNameLine(Iterator<String> lines) {
        while (lines.hasNext()) {
            String line = lines.next();
            String trim = line.trim();
            if (!trim.isEmpty() && !trim.startsWith("#")) return trim;
        }
        return null;
    }

    static int indexOfSeparator(String trimedLine, int fromIndex) {
        for (int i = fromIndex; i < trimedLine.length(); i++) {
            char c = trimedLine.charAt(i);
            if (c == ' ' || c == '\t') return i;
        }
        return -1;
    }

    private static String nextName(Iterator<String> lines, String currentName) {
        while (true) {
            String line = nextNameLine(lines);
            if (line == null) return null;

            int idx = indexOfSeparator(line, 0);
            String name = idx < 0 ? line : line.substring(0, idx);
            if (!name.equals(currentName)) return name;
        }
    }

    private static String nextLine(BufferedReader lineReader) {
        try {
            return lineReader.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
