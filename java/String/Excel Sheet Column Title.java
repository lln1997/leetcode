class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int cur = --n%26;
            sb.append((char)('A'+cur));
            n/=26;
        }
        return sb.reverse().toString();
    }
}
