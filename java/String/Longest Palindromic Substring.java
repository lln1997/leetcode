class Solution {
    public int l=0;
    public int r=0;
    public int max=0;
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n<2) return s;
        for(int i=0;i<n-1;i++){
            extend(s,i,i);
            extend(s,i,i+1);
        }
        return s.substring(l,r+1);
    }
    
    public void extend(String s,int i,int j){
        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)){
            i--;//ÍË³öºóÊÇ-1
            j++;
        }
        i++;
        j--;
        if(j-i+1>max){
            l = i;
            r = j;
            max = j-i+1;
        }
    }
}