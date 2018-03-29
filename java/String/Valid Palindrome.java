class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        String cur = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int len = cur.length();
        for(int i=0;i<len/2;i++){
            char c = cur.charAt(i);
            char p = cur.charAt(len-1-i);
            if(c!=p) return false;
        }
        return true;
    }
}