class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len=nums.length,min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i=0;i<len-2;i++){
            int tar = target-nums[i];
            int j = i+1,k=len-1;
            while(j<k){
                int sum = nums[k]+nums[j];
                if(sum==tar){
                    return target;
                }else {
                    int minu = tar-sum;
                    if(Math.abs(minu)<Math.abs(min)) 
                        min = minu;
                    if(sum>tar) k--;
                    else j++;
                }
            }
        }
        return target-min;
    }
}