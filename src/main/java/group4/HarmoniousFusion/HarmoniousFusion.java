package group4.HarmoniousFusion;

import java.util.Arrays;

public class HarmoniousFusion {
    public int[] merge(int[] arr1, int[] arr2) {
        // Handle nulls gracefully
        if (arr1 == null) return arr2 == null ? new int[0] : arr2.clone();
        if (arr2 == null) return arr1.clone();

        // Step 1: create a new array big enough for both
        int[] merged = new int[arr1.length + arr2.length];

        // Step 2: copy arr1 into merged
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Step 3: copy arr2 into merged (start after arr1 ends)
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        // Step 4: sort the result
        Arrays.sort(merged);

        return merged;
    }
}
