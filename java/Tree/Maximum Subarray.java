class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0],len,max = nums[0];
        len = nums.length;
        if(len==0) return sum;
        for(int i =1;i<len;i++){
            int cur = nums[i]+sum;
            if(cur<=nums[i]){
                sum = nums[i];
            }else{
                sum = cur;
            }
            if(sum>max) max = sum;
        }
        return max;
    }
}