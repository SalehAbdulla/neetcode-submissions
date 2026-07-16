class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String s: strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            hashMap.putIfAbsent(sortedS, new ArrayList<>());
            hashMap.get(sortedS).add(s);
        }
        return new ArrayList<>(hashMap.values());
    }
}
