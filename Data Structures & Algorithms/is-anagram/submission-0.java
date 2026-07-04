class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int index = c - 'a';
            freq[index]++;
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            int index = c - 'a';
            freq[index]--;
        }
        for(int x:freq) {
            if(x!=0) return false;
        }
        return true;
    }
}
