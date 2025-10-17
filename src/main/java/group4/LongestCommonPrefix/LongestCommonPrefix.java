package group4.LongestCommonPrefix;

public class LongestCommonPrefix {

    public String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // start with the first string

        for (int i = 1; i < strs.length; i++) {
            // Keep shortening prefix until it matches the start of strs[i]
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return ""; // no common prefix
                }
            }
        }

        return prefix;
    }
}