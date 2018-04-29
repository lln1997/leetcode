class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=1,len=s.length();
        int j=0,max=0;
        HashMap<Character,Integer> m = new HashMap<Character,Integer>();
        for(int i=0;i<len;i++){
            if(m.containsKey(s.charAt(i))){
                j = Math.max(j,m.get(s.charAt(i))+1);//记录最近的一个重复的（保证不会回退到包含重复的字符的子串）
            }
            m.put(s.charAt(i),i);
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}
