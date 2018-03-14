class Solution {
    public int searchInsert(int[] nums, int target) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<target){
        //         count++;
        //     }else if(nums[i]==target){
        //         return i;
        //     }else{
        //         return count;
        //     }
        // }
        // return count;
        int high=nums.length-1,low=0;
        while(low<=high){
            int mid = (high+low)/2;
            if(target==nums[mid]) return mid;
            else if(target>nums[mid]) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}