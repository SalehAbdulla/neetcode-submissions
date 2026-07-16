class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sToArray = new char[s.length()];
        char[] tToArray = new char[t.length()];

        for (int i = 0; i < s.length(); i++) {
            sToArray[i] = s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            tToArray[i] = t.charAt(i);
        }

        Arrays.sort(sToArray);
        Arrays.sort(tToArray);

        return Arrays.equals(sToArray, tToArray);

    }
}
