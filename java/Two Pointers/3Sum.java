class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);//nlogn<n^2
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for(int i=0;i<len-2;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int cur = 0-nums[i],j=i+1,k=len-1;
            while(j<k){
                if(nums[j]+nums[k]==cur){
                    List<Integer> l = new ArrayList<Integer>();
                    l.add(nums[j]);
                    l.add(nums[k]);
                    l.add(nums[i]);
                    list.add(l);
                    j++;k--;
                    while(j<k&&nums[j]==nums[j-1]) j++;
                    while(j<k&&nums[k]==nums[k+1]) k--;
                }else if(nums[j]+nums[k]<cur) j++;
                else k--;
            }
        }
        return list;
    }
}