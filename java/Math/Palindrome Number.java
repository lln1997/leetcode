class Solution {
    public boolean isPalindrome(int x) {
        //ʵ���Ͻ�ԭ���ַ�תһ��Ϳ����ж��Ƿ��ǻ����ˡ����⣬��0��β�ķ����������ǻ���
        if(x<0||(x!=0&&x%10==0)) return false;
        int res=0;
        while(x>res){
            res = res*10+x%10;
            x/=10;
        }
        return x==res||x==res/10;//һ���ж�ż����һ���ж�����
    }
}