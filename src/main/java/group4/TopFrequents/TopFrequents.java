package group4.TopFrequents;

import java.util.*;

public class TopFrequents {

    public List<Integer> findTopKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        Map<Integer, Integer> firstIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            firstIndexMap.putIfAbsent(num, i);
        }

        List<Integer> numbers = new ArrayList<>(freqMap.keySet());

        // Sort by frequency (descending), then by first occurrence
        numbers.sort((a, b) -> {
            int freqCompare = freqMap.get(b) - freqMap.get(a);
            if (freqCompare != 0) return freqCompare;
            return firstIndexMap.get(a) - firstIndexMap.get(b);
        });

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.min(k, numbers.size()); i++) {
            result.add(numbers.get(i));
        }

        return result;
    }
}