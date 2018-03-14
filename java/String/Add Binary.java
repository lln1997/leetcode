class Solution {
    public String addBinary(String a, String b) {
        int alen = a.length()-1,blen = b.length()-1,cur=0;
        StringBuilder sb = new StringBuilder();
        while(alen>=0||blen>=0){
            int sum=cur;
            if(blen>=0) sum+=b.charAt(blen--)-'0';
            if(alen>=0) sum+=a.charAt(alen--)-'0';
            
            sb.append(sum%2);
            cur = sum/2;
        }
        if(cur==1) sb.append(cur);
        return sb.reverse().toString();
    }
}
