class Solution {
    public int majorityElement(int[] nums) {
        //摩尔投票算法
        int len = nums.length;
        int m = nums[0],count=1;
        for(int i=1;i<len;i++){
            if(count==0){
                m=nums[i];
                count++;
            }
            else if(m==nums[i]){
                count++;
            }else count--;
        }
        return m;
    }
}
