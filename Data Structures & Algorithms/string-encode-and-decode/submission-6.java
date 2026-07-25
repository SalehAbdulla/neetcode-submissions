class Solution {


    public static String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < strs.size(); i++) 
        {
            String word = strs.get(i);
            result.append(word.length());
            result.append("#");
            result.append(word);
        }

        return result.toString();
    }

    public static List<String> decode(String str) {
        if (str.isEmpty()) return new ArrayList<>();
        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int delimiterIndex = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            
            String word = str.substring(delimiterIndex + 1, delimiterIndex + 1 + length);
            result.add(word);

            i = delimiterIndex + 1 + length;
        }

        return result;
    }

}