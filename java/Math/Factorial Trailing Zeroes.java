class Solution {
    public int trailingZeroes(int n) {
        //0ֻ��2*5��������Ϊ2��5�࣬����ֻҪ����������5�ĸ�����ע��25������5
        int count = 0;
        while(n>0){
            count+=n/5;
            n/=5;
        }
        return count;
    }
}