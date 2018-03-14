class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length,j=0;
        for(int i =0;i<len;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}