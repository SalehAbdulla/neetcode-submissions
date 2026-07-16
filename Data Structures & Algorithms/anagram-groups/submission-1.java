class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();

        for (String word : strs) {
            int[] freq = getFrequency(word);
            String key = Arrays.toString(freq); // Serialize the array to use as key
            hashMap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(hashMap.values());
    }

    private static int[] getFrequency(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        return count;
    }

}
