class Solution {
    public int maxSubArray(int[] nums) {
        // int sum = nums[0],len,max = nums[0];
        // len = nums.length;
        // if(len==0) return sum;
        // for(int i =1;i<len;i++){
        //     int cur = nums[i]+sum;
        //     if(cur<=nums[i]){
        //         sum = nums[i];
        //     }else{
        //         sum = cur;
        //     }
        //     if(sum>max) max = sum;
        // }
        int n = nums.length;
        int[] db = new int[n];
        db[0] = nums[0];
        int max = db[0];
        
        for(int i = 1;i<n;i++){
            db[i] = nums[i]+(db[i-1]>0?db[i-1]:0);
            max = Math.max(max,db[i]);
        }
        
        return max;
    }
}