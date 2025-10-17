package group4.AnagramChecker;

import java.util.Arrays;

public class AnagramChecker {
    public boolean isAnagram(String str1, String str2) {
        // Handle null inputs
        if (str1 == null || str2 == null) {
            return false;
        }

        // Normalize: lowercase and remove spaces
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        // If lengths differ, cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert to char arrays and sort them alphabetically
        char[] arr1 = s1.toCharArray(); // char[] tähendab karakterite massiivi.
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays if they are equal
        return Arrays.equals(arr1, arr2);
    }
}

//ToCharArray on meetod, mis teisendab stringi karakterite massiiviks.
//Arrays.sort on meetod, mis sorteerib karakterite massiivi tähestikulises järjekorras.
//Arrays.equals on meetod, mis võrdleb kahte karakterite massiivi ja tagastab true, kui need on identsed, ja false, kui need erinevad.