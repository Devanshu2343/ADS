class SlidingWindowTech {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            for (int j = 1; j <= length; j++) {
                if (isUnique(s, i, j)) {
                    maxLength = Math.max(maxLength, j - i);
                }
            }
        }
        
        return maxLength;
    }
    
    private boolean isUnique(String s, int start, int end) {
        boolean[] ch = new boolean[128];  
        
        for (int i = start; i < end; i++) {
            char x = s.charAt(i);
            if (ch[x]) {
                return false;
            }
            ch[x] = true;
        }
        
        return true;
    }
    public static void main(String[] args) {
        SlidingWindowTech solution = new SlidingWindowTech(); 
        String input = "abcabcbabbab";
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println(result);
    }
    
}
