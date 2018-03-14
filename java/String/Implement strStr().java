class Solution {
    public int strStr(String haystack, String needle) {
        int hlen=haystack.length(),nlen = needle.length(),i,j;
        for(i = 0;i<hlen-nlen+1;i++){
            for(j = 0;j<nlen;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)) break;
            }
            if(j==nlen) return i;
        }
        return -1;
    }
}