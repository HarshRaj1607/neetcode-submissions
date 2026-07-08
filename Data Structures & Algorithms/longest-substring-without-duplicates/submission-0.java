class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength = 1;
        int i = 1;
        int j = 0;
        HashMap<Character, Integer> sub = new HashMap<>();
        if(!s.isEmpty()) {
            sub.put(s.charAt(0),0);
            while(i<s.length()){
                if(sub.containsKey(s.charAt(i))){
                    j = Math.max(j,sub.get(s.charAt(i))+1);
                    }
                    sub.put(s.charAt(i),i);
                    maxlength = Math.max(maxlength,(i-j)+1);
                    i++;  
            }
            return maxlength;
        }
        return 0;
    }
}
