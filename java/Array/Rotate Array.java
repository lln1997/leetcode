class Solution {
    public void rotate(int[] nums, int k) {
    //     int cur = k%nums.length;
    //     int[] c = new int[nums.length];
    //     for(int i=0;i<cur;i++){
    //         c[i] = nums[nums.length-cur+i];
    //     }
    //     for(int i=cur;i<nums.length;i++){
    //         c[i]=nums[i-cur];
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         nums[i]=c[i];
    //     }
        
        if(nums == null || nums.length < 2) return;
        int cur = k%nums.length;
        int pre = nums.length-cur;
        reverse(nums,0,pre-1);
        reverse(nums,pre,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    
    public void reverse(int[] num,int c,int k){
        int m = k-c+1;
        int n = m/2;
        for(int j=0;j<n;j++){
            int temp = num[k-j];
            num[k-j] = num[c+j];
            num[c+j] = temp;
        }
    }
}
