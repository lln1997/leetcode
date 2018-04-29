class Solution {
    public int trailingZeroes(int n) {
        //0只由2*5得来，因为2比5多，所以只要计算质因数5的个数。注意25有两个5
        int count = 0;
        while(n>0){
            count+=n/5;
            n/=5;
        }
        return count;
    }
}