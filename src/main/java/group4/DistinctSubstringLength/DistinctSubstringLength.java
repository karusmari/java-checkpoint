package group4.DistinctSubstringLength;

import java.util.HashSet;
import java.util.Set;

public class DistinctSubstringLength {
    public int maxLength(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (set.contains(c)) break; // duplicate found
                set.add(c);
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}
