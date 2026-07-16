class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String key = Arrays.toString(getFrequency(strs[i]));
            hashMap.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(hashMap.values());
    }

    public static int[] getFrequency(String word) {
        int[] res = new int[255];

        for (int i = 0; i < word.length(); i++) {
            res[word.charAt(i)]++;
        }

        return res;
    }
}
