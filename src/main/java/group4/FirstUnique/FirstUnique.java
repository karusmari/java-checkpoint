package group4.FirstUnique;

import java.util.HashMap;
import java.util.Map;

public class FirstUnique {
    public char findFirstUnique(String s) {
        Map<Character, Integer> countMap = new HashMap<>();

        // 1️⃣ Loome kaardistuse, mis loendab iga tähe esinemise
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // 2️⃣ Käime stringi läbi uuesti ja leiame esimese tähe, mille arv = 1
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (countMap.get(c) == 1) {
                return c;
            }
        }

        // Kui pole kordumatut tähe
        return '_';
    }
}


/*
import java.util.HashMap;
import java.util.Map;

public class FirstUnique {
    public char findFirstUnique(String s) {
        // Handle null or empty string
        if (s == null || s.isEmpty()) {
            return '_';
        }

        // Step 1: Count frequencies
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (frequency.containsKey(c)) {
                frequency.put(c, frequency.get(c) + 1);
            } else {
                frequency.put(c, 1);
            }
        }

        // Step 2: Find first unique character
        for (char c : s.toCharArray()) {
            if (frequency.get(c) == 1) {
                return c;
            }
        }

        // Step 3: If none found
        return '_';
    }
}
 */

