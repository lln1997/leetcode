class Solution {
    public boolean isPalindrome(int x) {
        //实际上将原数字反转一半就可以判断是否是回文了。另外，以0结尾的非零数都不是回文
        if(x<0||(x!=0&&x%10==0)) return false;
        int res=0;
        while(x>res){
            res = res*10+x%10;
            x/=10;
        }
        return x==res||x==res/10;//一个判断偶数，一个判断奇数
    }
}