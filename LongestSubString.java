import java.util.HashMap;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int pointer = 0;
        int maxLength = 0;  
        for (int i = 0; i < s.length(); i++) {
            char correctChar = s.charAt(i);
            if (map.containsKey(correctChar)) {
                pointer = Math.max(pointer, map.get(correctChar) + 1);
            }   
            map.put(correctChar, i);
            maxLength = Math.max(maxLength, i - pointer + 1);
        } 
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubString str1 = new LongestSubString();
        String input = "abcacfgfkfjf" ;
        int length = str1.lengthOfLongestSubstring(input);
        System.out.println(length);
    }
}
