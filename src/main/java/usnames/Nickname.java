package usnames;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Nickname {
    private static Map<String, String> nicknames = loadNicknames();

    public static String lookup(String orgName) {
        return nicknames.get(orgName);
    }

    private static Map<String,String> loadNicknames() {
        Map<String,String> ret = new HashMap<String, String>();

        Iterator<String> lines = Resource.lines(Summary.class.getResourceAsStream("nicknames.txt"));
        while (true) {
            String line = Resource.nextNameLine(lines);
            if (line == null) return ret;

            int nicknameStopIdx = Resource.indexOfSeparator(line, 0);
            String nickname = line.substring(0, nicknameStopIdx);

            int orgNameStopIdx  = Resource.indexOfSeparator(line, nicknameStopIdx + 1);
            String orgName = line.substring(nicknameStopIdx + 1, orgNameStopIdx);

            ret.put(orgName, nickname);
        }
    }
}
