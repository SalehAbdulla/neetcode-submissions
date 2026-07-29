class Solution {

    public static String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder stringBuilder = new StringBuilder();

        for (String word: strs)
        {
            stringBuilder.append(word.length());
            stringBuilder.append("#");
            stringBuilder.append(word);
        }

        return stringBuilder.toString();
    }

    public static List<String> decode(String str) 
    {
        if (str.isEmpty()) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        // 5#Hello5#World

        int i = 0;
        while (i < str.length()) 
        {
            int getNextHashIndex = str.indexOf("#", i);
            int getWordLength = Integer.parseInt(str.substring(i, getNextHashIndex));
            String getWord = str.substring(getNextHashIndex+1, getWordLength+getNextHashIndex+1);
            result.add(getWord);
            i = getNextHashIndex + getWordLength + 1;
        }

        return result;
    }

}